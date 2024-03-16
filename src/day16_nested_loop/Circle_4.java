package day16_nested_loop;

import java.util.Scanner;

public class Circle_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")){

           System.out.println("Enter the radius of the circle:");
           double radius = input.nextDouble();

            if (radius <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }


            System.out.println("perimeter = " + (radius*2));
           System.out.println("perimeter = " + (2*3.14*radius));
           System.out.println("area = " + (3.14*radius*radius));

           System.out.println("Would you like to calculate another circle?Yes/No");
           answer = input.next().toLowerCase();

            while( !(answer.equals("yes") || answer.equals("no")) ){
                System.err.println("Invalid Entry, please re-enter! Would you like to continue?");
                answer = input.next().toLowerCase();
            }

           if (answer.equals("no")) {
               System.out.println("Thank you for using Cydeo Circle Calculator APP");
               break;
           }
       }
        input.close();
    }
}
/*
4. Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if the user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle == Diameter = 2 × Radius.
                                        2. Area of circle == 2 *π* r
                                        3. Perimeter of a circle ==  π *r* r

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */