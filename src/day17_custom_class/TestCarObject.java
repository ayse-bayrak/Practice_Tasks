package day17_custom_class;

public class TestCarObject {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Mercedes", "GLA", 2023, "red", 3000000);

        System.out.println(car1);

        car1.start();
        car1.drive();
        car1.stop();
    }

}
