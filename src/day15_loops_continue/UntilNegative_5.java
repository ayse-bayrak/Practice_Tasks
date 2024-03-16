package day15_loops_continue;

import java.util.Scanner;

public class UntilNegative_5 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        Scanner input = new Scanner(System.in);
        //System.out.println("enter a number");
        //int num = input.nextInt();

        while (num>=0) {
            sum += num;
            System.out.println("enter a number");
            num = input.nextInt();
        }

        System.out.println("sum = " + sum);

        input.close();
    }
}
/*
5. Create a class named UntilNegative and Write a program that
calculates the sum of numbers entered by the user until the user enters a negative number.

 */