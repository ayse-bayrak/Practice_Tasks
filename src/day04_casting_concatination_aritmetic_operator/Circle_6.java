package day04_casting_concatination_aritmetic_operator;
/*
Create a class named Circle and declare the following variables:
                radius
                area
                perimeter

    6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5

            output:
                   The area of the circle is 78.5
                   The perimeter of the circle is 31.4
 */
public class Circle_6 {
    public static void main(String[] args) {
        int radius=5;
       double area, perimeter;
                area=3.14*radius*radius;
                perimeter=2*3.14*radius;
        System.out.println("The area of the circle is "+area);
        System.out.println("The perimeter of the circle is "+(float)perimeter);
    }
}
