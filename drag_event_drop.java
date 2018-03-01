case DragEvent.ACTION_DROP:
   requestDragAndDropPermissions(event); //Allow items from other applications
   ClipData.Item item = event.getClipData().getItemAt(0);

   if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {
       ...
       textTarget.setText(item.getText());
      
   } else if (event.getClipDescription().hasMimeType("application/x-arc-uri-list")) {
       //Note the use of ContentResolver to resolve the Chrome OS content URI
       Uri contentUri = item.getUri();
       ParcelFileDescriptor parcelFileDescriptor;
       try {
           parcelFileDescriptor = getContentResolver().openFileDescriptor(contentUri, "r");
       } catch (FileNotFoundException e) {
           e.printStackTrace();
           Log.d("DragDropDemo", "File not found.");
           return false;
       }

       FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
       ...
  }