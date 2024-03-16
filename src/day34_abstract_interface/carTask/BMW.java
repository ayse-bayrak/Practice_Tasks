package day34_abstract_interface.carTask;

public class BMW extends Car{
    protected BMW(String make, String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("You need to call the mechanic to jump-start "+getMake()+" "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving "+getMake()+" "+getModel()+" on the road");
    }
}
