protected class TextViewLongClickListener implements View.OnLongClickListener {
   @Override
   public boolean onLongClick(View v) {
       TextView thisTextView = (TextView) v;
       String dragContent = "Dragged Text: " + thisTextView.getText();

       //Set the drag content and type
       ClipData.Item item = new ClipData.Item(dragContent);
       ClipData dragData = new ClipData(dragContent, 
           new String[] {ClipDescription.MIMETYPE_TEXT_PLAIN}, item);

       //Set the visual look of the dragged object
       //Can be extended and customized. We use the default here.
       View.DragShadowBuilder dragShadow = new View.DragShadowBuilder(v);

       // Starts the drag, note: global flag allows for cross-application drag
       v.startDragAndDrop(dragData, dragShadow, null, DRAG_FLAG_GLOBAL);

       return false;
   }
}