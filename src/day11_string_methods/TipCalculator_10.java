package day11_string_methods;

import java.util.Scanner;

/*
10. Create a class called TipCalculator,
and write a program for a tip calculator.
    There will be different service quality benchmarks
    that will determine the tip given.
    There will also be the ability to calculate based on
    the number of people in the party and
    if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)
    And then it should display:
             The number of people who entered
             Total to pay
             Total tip
             Total per person
             Tip per person:
        Ex:
            Split or No Split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt
            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
 */
public class TipCalculator_10 {
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
        System.out.println("Split or No split (Yes/No)");
        String isSplit = scan.nextLine().toLowerCase();
        System.out.println("Enter the number of people");
        int number = scan.nextInt();
        System.out.println("Enter the check amount");
        int checkAmount = scan.nextInt();
        scan.nextLine();
        System.out.println("Service Quality?(Excellent/Great/Good/Fair/Poor)");
        String quality = scan.nextLine().toLowerCase();
        double tipPercentage=(quality.equals("excellent"))? 0.25 :(quality.equals("great"))? 0.2: (quality.equals("good"))?0.15
                :(quality.equals("good"))? 0.10:0.05;

//        like the above with ternary solution is much better

//        switch (quality){
//
//            case "Poor":
//                tipPercentage=1.05;
//                break;
//            case "Fair":
//                tipPercentage=1.10;
//                break;
//            case "Good":
//                tipPercentage=1.15;
//                break;
//            case "Great":
//                tipPercentage=1.20;
//                break;
//            case "Excellent":
//                tipPercentage=1.25;
//                break;
//            default:
//                System.out.println("invalid quality");
//                break;
//        }
        double totalToPay= checkAmount*(1+tipPercentage);
        double totalToTip =checkAmount*tipPercentage;

        //output display
        System.out.println("The number of people who entered: " + number);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total to tip: " + totalToTip);

        if (isSplit.equalsIgnoreCase("yes")) {
          double totalPerPerson = totalToPay/number;
          double tipPerPerson = totalToTip/number;
          System.out.println("Total per person: " + totalPerPerson);
          System.out.println("Tip per person: " + tipPerPerson);
        }

    }
}
