package day17_custom_class;

public class Car {

    public String make;
    public String model;
    public int year;
    public String color;
    public double price;

    public void setInfo(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void start() {

        System.out.println(make + " " + model + " is very exciting");
    }

    public void drive(){
        System.out.println("Driving "+make+" "+model);
    }

    public void stop(){
        System.out.println(make+" "+model+" has stopped");
    }
}
 /*
 Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in a print statement, it should display all the information of the car object
			start()
  */