package day29_inharitance.Car;

public class TestCar {
    public static void main(String[] args) {

        Audi audi = new Audi();
        audi.setInfo("q5",2023, "Red", -1000000 );

        System.out.println(audi);
        System.out.println(audi.getMake());

    }
}
