myImage.setOnHoverListener(new View.OnHoverListener() {
   @Override
   public boolean onHover(View v, MotionEvent event) {
       int action = event.getActionMasked();

       switch(action) {
           case ACTION_HOVER_ENTER:
               myImage.setColorFilter(Color.argb(127, 0, 0, 255)); //50% blue tint
               return true;

           case ACTION_HOVER_EXIT:
               myImage.clearColorFilter();
               return true;
       }

       return false;
   }
});