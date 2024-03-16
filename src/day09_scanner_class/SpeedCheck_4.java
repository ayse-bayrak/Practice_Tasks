package day09_scanner_class;

import java.util.Scanner;

public class SpeedCheck_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speedLimit =55;
        System.out.println("Enter the your current speed: ");
        int currentLimit = input.nextInt();

        if (currentLimit>speedLimit){
            System.out.println("You're driving 50 mph over the limit. Slow down!");
        }
    }
}
