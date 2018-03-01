//Get the persistent ViewModel
mDemoModel = ViewModelProviders.of(this).get(DemoViewModel.class);

Button clickMeButton = findViewById(R.id.button_clicktest);
clickMeButton.setOnClickListener(new View.OnClickListener() {
   @Override
   public void onClick(View v) {
       mDemoModel.incrementClicks();
   }
});

//Set up the Observer’s output View
final Observer<Integer> clickObserver = new Observer<Integer>() {
   @Override
   public void onChanged(@Nullable final Integer newCount) {
       // Update the UI, in this case a TextView.
       mClickText.setText(newCount.toString());
   }
};
mDemoModel.getNumClicks().observe(this, clickObserver); //Connect Observer to ViewModel data