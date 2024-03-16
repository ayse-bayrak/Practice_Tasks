package ayse_working.selfGroupMeeting;

import java.util.Scanner;
public class NumberSumCalculatorScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int count = 0;

        while(true) {
            System.out.println("Enter a number (please enter -1 to exit)");
            int number = input.nextInt();
            if (number==-1) {
                break; // use exit the loop
            }
            total += number;
            count++;
        }
        System.out.println("The sum of the entered numbers is " + total);
        System.out.println("The number of the entered input is " + count);
    }
}
/*
// Use a loop with Scanner to repeatedly take user input for a number.
        // Exit the loop if the user enters -1.
        // Calculate and print the sum of all entered numbers.
        // Example:
        // Enter a number (-1 to exit): 5
        // Enter a number (-1 to exit): 3
        // Enter a number (-1 to exit): 8
        // Enter a number (-1 to exit): -1
        // Output: The sum of the entered numbers is 16.
 */