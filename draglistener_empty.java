protected class DropTargetListener implements View.OnDragListener {
@Override
public boolean onDrag(View v, DragEvent event) {
   		final int action = event.getAction();

   switch(action) {
       case DragEvent.ACTION_DRAG_STARTED:
           return true;

       case DragEvent.ACTION_DRAG_ENTERED:
           return true;

       case DragEvent.ACTION_DRAG_LOCATION:
           return true;

       case DragEvent.ACTION_DRAG_EXITED:
           return true;

       case DragEvent.ACTION_DROP:
           return true;

       case DragEvent.ACTION_DRAG_ENDED:
           return true;

       default:
           Log.d("DragDropDemo","Unknown action type received by DropTargetListener.");
           return false;
   }
}
}