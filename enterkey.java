editText.setOnKeyListener(new View.OnKeyListener() {
   public boolean onKey(View v, int keyCode, KeyEvent keyEvent) {
       if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
               (keyCode == KeyEvent.KEYCODE_ENTER)) {
           //Insert behaviour here
           return true;
       }
       return false;
   }
});