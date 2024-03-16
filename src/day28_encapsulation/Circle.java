package day28_encapsulation;

public class Circle {

    private double radius;

    public static double pi = 3.14;

    public Circle(double radius) { //Add a constructor that can set the radius of a circle when a circle object is created
        //(If the arguments are not valid, it should not be set to the instances)

        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) { //The radius of the circle can not be zero or negative
        if (radius <= 0) {
            System.err.println("The radius of the circle can not be zero or negative");
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calcArea() {
        return pi*radius*radius;
    }

    public double calcPerimeter() {
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", calcArea=" + calcArea() +
                ", calcPerimeter=" + calcPerimeter() +
                '}';
    }
}
/*
Create a class named Circle

        Private variables:
            radius

        Public variable:
            pi

         Encapsulate all the private fields.

                 1. The radius of the circle can not be zero or negative

         Add a constructor that can set the radius of a circle when a circle object is created
                 (If the arguments are not valid, it should not be set to the instances)

         Methods:
             calcArea()
             calcPerimeter()
             toString(): displays the radius, area, and perimeter of the circle when the circle object is passed in the print statement

 */