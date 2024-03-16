package day34_abstract_interface.deviceTask;

public class Iphone extends Phone implements Downloadable, AppleApps{
    public Iphone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+ "-" + getModel() + ", application is downloading from " + AppStoreName);
    }
}
