package day09_scanner_class;
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println("radius = " + radius);
        double pi = 3.14;
        double area = pi * radius * radius;
        double perimeter = 2 * pi * radius;
        System.out.println("area = " + area);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("perimeter = " + df.format(perimeter));
    }
}
