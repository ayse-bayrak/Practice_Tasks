package day17_custom_class;

public class Rectangle {

    public double length, width;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length*width;

    }

    public double calculatePerimeter() {
        return  2*(length+width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}
/*
create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, and returns it as a double
		    toString(): when a rectangle object is passed in the print statement
		    		it should display the length, width, area, and perimeter of the Rectangle object
 */