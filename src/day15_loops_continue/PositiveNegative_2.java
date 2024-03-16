package day15_loops_continue;

import java.util.Scanner;

public class PositiveNegative_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int isZero = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num < 0) {
            negative +=1;
            }
            else if (num > 0){
                positive += 1;

            }else {
                isZero +=1;
            }

        }
        System.out.println(positive + " positive");
        System.out.println(negative + " negative");
        System.out.println(isZero + " zero");
        input.close();
    }
}
/*
2. Create a class named PositiveNegative and write a program that asks the user to enter a number for 5 times,
and print how many positive and negative numbers the user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */