package day31_inheritanceOverriding.browserTask;
// Base class
public class Browser {
    private String name;// it is not necessary actually, yes correct, Muhtar did not write this code fragman

//methods
    public void openBrowser(){
        System.out.println("Opening " + getClass().getSimpleName() + " browser");
        //prints each browser separately "opening .... browser"
    }

   public void closeBrowser(){
       System.out.println("Closing "+ getClass().getSimpleName() + " browser");
      // prints each browser separately  "closing ..... browser"
   }

}
