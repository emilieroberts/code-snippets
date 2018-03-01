case DragEvent.ACTION_DRAG_ENTERED:
   // Increase green background colour when item is over top of target
   v.setBackgroundColor(Color.argb(150,0,255,0));
   v.invalidate();
   return true;

case DragEvent.ACTION_DRAG_EXITED:
   // Less intense green background colour when item not over target
   v.setBackgroundColor(Color.argb(55,0,255,0));
   v.invalidate();
   return true;

case DragEvent.ACTION_DRAG_ENDED:
   // Restore background colour to transparent
   v.setBackgroundColor(Color.argb(0,255,255,255));
   v.invalidate();
   return true;