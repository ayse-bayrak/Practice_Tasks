package day09_scanner_class;

import java.util.Scanner;

public class HowManyPeople_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people they live with: ");
        int numberPeople = input.nextInt();
        System.out.println("numberPeople = " + numberPeople);

        if (numberPeople<3) {
            System.out.println("live with less than 3 people");
        }else if (numberPeople>=3 && numberPeople <=6){
            System.out.println("live with 3-6 people");
        }else {
            System.out.println("live with more than 6 people");
        }
    }
}
