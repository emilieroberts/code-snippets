protected class DropTargetListener implements View.OnDragListener {
   @Override
   public boolean onDrag(View v, DragEvent event) {
       final int action = event.getAction();

       switch(action) {
		...
           case DragEvent.ACTION_DROP:
               requestDragAndDropPermissions(event); //Allow items from other applications
               ClipData.Item item = event.getClipData().getItemAt(0);

   		//Note: application/x-arc-uri-list is MIME-type for Chrome OS files dropped into the app
               if (event.getClipDescription().hasMimeType("application/x-arc-uri-list")) {
                   Uri contentUri = item.getUri();
                   ParcelFileDescriptor parcelFileDescriptor;
                   try {
                       parcelFileDescriptor = getContentResolver().openFileDescriptor(contentUri, "r");
                   } catch (FileNotFoundException e) {
                       e.printStackTrace();
                       return false;
                   }

                   FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();

               } else {
                   return false;
               }
               return true;
		...
       }
   }
}