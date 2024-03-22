package ayse_working.GroupMeeting.part1Questions;

import java.util.Scanner;

public class Question_2_GuessNumber2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int targetNumber = 56;
        System.out.println("Enter a number between 1 and 100");
        int number = input.nextInt();

        while (!(number == targetNumber)) {

            if (number > targetNumber) {
                System.out.println("Your number is greater than target number! Go on estimate target number");
                number = input.nextInt();
            } else {
                System.out.println("Your number is less than target number! Go on estimate target number");
                number = input.nextInt();
            }
        }

        System.out.println("Congrants!, you found target number");
        input.close();
    }

}
