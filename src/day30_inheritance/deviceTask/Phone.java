package day30_inheritance.deviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void call(long number) {
        System.out.println(getBrand()+ "-" + getModel() + " is calling " + number);
    }
    public void text(long number) {
        System.out.println(getBrand()+ "-" + getModel() + " is texting " + number);
    }
}
/*
1. Phone
				Extra methods:
					call(), text()
 */