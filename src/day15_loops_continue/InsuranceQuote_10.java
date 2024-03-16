package day15_loops_continue;

import java.util.Scanner;

public class InsuranceQuote_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";
        System.out.println("Welcome to our Insurance Quote Calculation");
        while (answer.equals("yes")) {

            //1. Ask the user to enter your name
            System.out.println("Please enter your name : ");
            String name = input.next();

            //2. Ask the user to enter your gender
            System.out.println("Please enter your gender m, f : ");
            char gender = input.next().charAt(0);
            gender = Character.toLowerCase(gender);
            while (!(gender == 'f' || gender == 'm')) {
                System.err.println("You entered an invalid entry, please re-enter a valid entry");
                gender = input.next().charAt(0);
            }

            //3. Ask the user if he/she is married(Yes/No)
            System.out.println("Are you married? Yes/No ");
            String isMarried = input.next().toLowerCase();
            while (!(isMarried.equals("yes") || isMarried.equals("no"))) {
                System.err.println("You entered an invalid entry, please re-enter a valid entry");
                isMarried = input.next().toLowerCase();
            }

            //4. Ask the user to enter your age (age can not be negative or greater than 120)
            System.out.println("Enter your age ");
            int age = input.nextInt();
            while (!(age > 0 && age < 120)) {
                System.err.println("You entered an invalid entry, please re-enter a valid entry");
                age = input.nextInt();
            }

            //5. Ask the user to enter how many miles he/she drives in a day (mileage can not be negative or less than 5)
            System.out.println("How many miles do you drive in a day?");
            int miles = input.nextInt();
            while (miles < 5) {
                System.out.println("You entered an invalid entry, please re-enter a valid entry");
                miles = input.nextInt();
            }
            //6. Ask the user if he/she wants full coverage or liability insurance.
            input.nextLine();
            System.out.println("Which one do you want 'full coverage' or 'liability' insurance? ");
            String insuranceType = input.nextLine().toLowerCase();

            while (!(insuranceType.equals("full coverage") || insuranceType.equals("liability"))) {
                System.err.println("You entered an invalid entry, please re-enter a valid entry");
                insuranceType = input.nextLine().toLowerCase();
            }

            //7. Ask if he/she had any accidents or claims in the past 5 years (Yes/No)
            System.out.println("Have you had any accidents or claims in the past 5 years (Yes/No) ");
            String hadAccidentsOrClaims = input.next();

            while (!(hadAccidentsOrClaims.equals("yes") || hadAccidentsOrClaims.equals("no"))) {
                System.err.println("You entered an invalid entry, please re-enter a valid entry");
                hadAccidentsOrClaims = input.next().toLowerCase();
            }

            //8. Ask the user if his/her car has an anti-theft device (Yes/No)
            System.out.println("Does your car have an anti-theft device? (Yes/No) ");
            String hasAntiTheftDevice = input.next().toLowerCase();

            while (!(hasAntiTheftDevice.equals("yes") || hasAntiTheftDevice.equals("no"))) {
                System.err.println("You entered an invalid entry, please re-enter a valid entry");
                hasAntiTheftDevice = input.next().toLowerCase();
            }
            // Insurance Quote price calculation:
            double insuranceCost = 0;

            if (insuranceType.equals("liability")) {

                if (age < 25) {
                    insuranceCost += 90;
                } else {
                    insuranceCost += 50;
                }

                if (miles <= 10) {
                    insuranceCost += 10;
                } else if (miles > 10 && miles <= 50) {
                    insuranceCost += 30;
                } else {
                    insuranceCost += 50;
                }

            } else { // insuranceType ==> full coverage
                if (age < 25) {
                    insuranceCost += 160;
                } else {
                    insuranceCost += 120;
                }

                if (miles <= 10) {
                    insuranceCost += 20;
                } else if (miles > 10 && miles <= 50) {
                    insuranceCost += 40;
                } else {
                    insuranceCost += 70;
                }

            }


            if (hasAntiTheftDevice.equals("yes")) {
                insuranceCost *= 0.95;
            }

            if (hadAccidentsOrClaims.equals("yes")) {
                insuranceCost *= 1.15;
            } else {
                insuranceCost *= 0.90;
            }

            if (isMarried.equals("yes")) {
                insuranceCost *= 0.95;
            }
            System.out.println("Ms/Mss " + name.toUpperCase() + ", your total insurance quote: " + insuranceCost);

            System.out.println("Would you like to another quote? Yes/No");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid entry, please re-enter answer");
                answer = input.next().toLowerCase();
            }

        }

        input.close();
    }
}

/*

Muhtar added new requirement .. ask would you like to  another insurance quote? and go on until say no

10. Create a class called InsuranceQuote, and write a program that can calculate the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)
				4. Ask the user to enter your age
						(age can not be negative or greater than 120)
						(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)
				5. Ask the user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance.

				7. Ask if he/she had any accidents or claims in the past 5 years (Yes/No)
						(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has an anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in the past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in the past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount

 */