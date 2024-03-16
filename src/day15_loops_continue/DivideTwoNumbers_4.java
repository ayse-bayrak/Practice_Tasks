package day15_loops_continue;

public class DivideTwoNumbers_4 {
    public static void main(String[] args) {

        double num1 = 6.0;
        double num2 = 4.0;
        double division = 0;

        if (num1 >= num2) {
            while (num1 >= num2) {
                num1 -= num2;
                division += 1;

            }
        }
        else  {
            while (num2 > num1) {
                num2 -= num1;
                division += 1;

            }
        }
        System.out.println("division = " + division);



    }
}
/*
Create a class named DivideTwoNumbers and Write a program
that can divide two positive numbers without using / (division) and * (multiplication) operator
 */