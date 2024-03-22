package ayse_working.GroupMeeting.part1Questions;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberAli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        int userGuess;
        boolean guessedCorrectly = false;

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
            }

        } while (!guessedCorrectly);

        // Close the scanner (not necessary, but good practice)
        scanner.close();
    }
}
