package day34_abstract_interface.carTask;

public class CydeoCar extends Car implements AutoPilot, Flyable, Swimmable{
    protected CydeoCar(String make, String model, int year, double price, String color) {
        super("Cydeo", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" auto park mode is on");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" auto pilot mode is on");
    }

    @Override
    public void start() {
        System.out.println("use voice control to start "+getMake()+" "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving "+getMake()+" "+getModel()+" on the road");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" can fly");
    }


    @Override
    public void swim() {
        System.out.println(getMake()+" "+getModel()+" can swim");
    }
}
