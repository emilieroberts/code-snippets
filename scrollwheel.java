scrollableView.setOnGenericMotionListener(new View.OnGenericMotionListener() {
   @Override
   public boolean onGenericMotion(View v, MotionEvent event) {
       if (event.getAction() == MotionEvent.ACTION_SCROLL) {
           // scroll behavior
           return true;
       }
       return false;
   }
});