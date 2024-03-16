package day34_abstract_interface.carTask;

public class Mercedes extends Car implements AutoPark{
    protected Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
