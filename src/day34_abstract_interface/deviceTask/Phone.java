package day34_abstract_interface.deviceTask;

public class Phone extends Device{
    public Phone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Press the power-button to turn on the phone "+getBrand()+" "+getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Press the power-button to turn off the phone "+getBrand()+" "+getModel());
    }

    public void call(long phoneNum) {
        System.out.println(getBrand()+ "-" + getModel() + " is calling to " +phoneNum);
    }

    public void text(long phoneNum) {
        System.out.println(getBrand()+ "-" + getModel() + " is texting to " + phoneNum);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", color='" + getColor() + '\'' +
                ", price='" + getPrice() + '\'' +
                '}';
    }
}
