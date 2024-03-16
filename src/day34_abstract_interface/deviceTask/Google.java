package day34_abstract_interface.deviceTask;

public class Google extends Phone implements AndroidApps{


    public Google(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+ AppStoreName);
    }
}
