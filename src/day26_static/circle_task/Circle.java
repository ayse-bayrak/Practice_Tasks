package day26_static.circle_task;

public class Circle {

    public double radius;
    public double diamater; // d = 2r;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diamater = 2 * radius;
    }

    public double calcArea() { //returns the area of the circle
        return pi * radius * radius;
    }

    public double calcPerimeter() { //returns the perimeter of Circle, 2πr
        return  pi * diamater;
    }
    public static void displayPi(){
        System.out.println("the PI value is " + pi);
    }

}
/*
2. Circle Task:
1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of the circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays the PI value
					toString(): displays the radius, diameter, pi, area, and perimeter of the circle when the object of a circle is passed in the print statement
 */