public class DemoViewModel extends ViewModel {
   private MutableLiveData<Integer> numClicks;

   public MutableLiveData<Integer> incrementClicks() {
       numClicks.setValue(getNumClicks().getValue() + 1);
       return numClicks;
   }

   public MutableLiveData<Integer> getNumClicks() {
       if (this.numClicks == null) {
           this.numClicks = new MutableLiveData<Integer>();
           this.numClicks.setValue(0);
       }
       return numClicks;
   }
}