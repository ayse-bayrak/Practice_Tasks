package day34_abstract_interface.carTask;

public class CarShop {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyata", "Avensis",2010, 1000000, "Grey");

        Honda honda = new Honda("Honda", 2015, 2015, "White");

        Audi audi = new Audi("Audi", "Q7", 2020, 800000, "White");

        Mercedes mercedes = new Mercedes("Mercedes", " GLA200", 2023, 750000, "Red");

        CydeoCar cydeoCar = new CydeoCar("CydeCar", "VA", 2023, 900000, "Blue");

        System.out.println("===========================================================");
        //Create a subclass of Car named Toyota, Honda, BMW
        toyota.start();// abstract methods from abstract class
        toyota.drive();// abstract methods from abstract class
        toyota.stop();// none-abstract methods from abstract class
        System.out.println(toyota);// none-abstract methods from abstract class

        honda.start();// abstract methods from abstract class
        honda.drive();// abstract methods from abstract class
        honda.stop();// none-abstract methods from abstract class
        System.out.println(honda);// none-abstract methods from abstract class

        //subclasses of Car named Audi and Mercedes that implement the AutoPark interface
        audi.start(); // abstract methods from abstract class
        audi.drive(); // abstract methods from abstract class
        audi.stop(); // none-abstract methods from abstract class
        System.out.println(audi); // none-abstract methods from abstract class
        audi.autoPark(); // from AutoPark interface

        mercedes.start(); // abstract methods from abstract class
        mercedes.drive(); // abstract methods from abstract class
        mercedes.stop(); // none-abstract methods from abstract class
        System.out.println(mercedes); // none-abstract methods from abstract class
        mercedes.autoPark(); // from AutoPark interface






    }
}
