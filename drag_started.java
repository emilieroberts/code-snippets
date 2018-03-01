case DragEvent.ACTION_DRAG_STARTED:
   // Limit the types of items we can receive
   if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)
           || event.getClipDescription().hasMimeType("application/x-arc-uri-list")) {

       // Greenify background colour so user knows this is a target
       v.setBackgroundColor(Color.argb(55,0,255,0));
       v.invalidate();
       return true;
   }

//If the dragged item is of an unrecognized type, we indicate this is not a valid target
return false;