package ayse_working.GroupMeeting;

import java.util.Scanner;

public class Member {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter loyalty points please ");
        int loyaltyPoints = scan.nextInt();
        if (loyaltyPoints >= 0 && loyaltyPoints % 10 == 0) {
            if (loyaltyPoints >= 100) {
                System.out.println("Congratulations! You are a Gold Member. Enjoy a 10% discount!");
            } else if (loyaltyPoints >= 50) {
                System.out.println("You are a Silver Member. Enjoy a 5% discount on your order.");
            } else if (loyaltyPoints >= 20) {
                System.out.println("As a Bronze Member, you qualify for a 2% discount.");
            } else {
                System.out.println("Thank you. No discount applied this time.");
            }
        } else System.out.println("Invalid Loyalty Number");
        scan.close();
    }

}
/*
The cafe owner came up with new requirements. New discount levels are defined as follows:

•    Gold Member: 10% discount for 100 or more loyalty points
•    Silver Member: 5% discount for 50 to 99 loyalty points
•    Bronze Member: 2% discount for 20 to 49 loyalty points
•    Regular Customer: No discount for less than 20 loyalty points

Write a Java program that takes the loyalty points of a customer as input and outputs the below messages based on their loyalty points. The loyalty points are positive integers and should only be multiples of 10. Otherwise, the below message will be displayed on the screen.

•    Gold Member: "Congratulations! You are a Gold Member. Enjoy a 10% discount!"
•    Silver Member: "You are a Silver Member. Enjoy a 5% discount on your order."
•    Bronze Member: "As a Bronze Member, you qualify for a 2% discount."
•    Regular Customer: "Thank you. No discount applied this time."
•    “Invalid Loyalty Number!”
 */