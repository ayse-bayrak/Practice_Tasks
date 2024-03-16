package day34_abstract_interface.deviceTask;

public class Computer extends Device{
    public Computer(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Press the power-button to turn on the computer "+getBrand()+" "+getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Press the power-button to turn off the computer "+getBrand()+" "+getModel());

    }
}
