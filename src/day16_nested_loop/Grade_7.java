package day16_nested_loop;

import java.util.Scanner;

public class Grade_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


       while (true) {

           System.out.println("Enter your score");
           int s = input.nextInt(); // s == score

           if (s < 0 || s > 100) {
               System.err.println("Invalid Entry");
               System.exit(0);
           }
           char grade = (s >= 90 )?'A':(s >= 80)?'B': (s >= 70)?'C'
                   :(s >= 60)?'D':'F';

           System.out.println("Your grade = " + grade);

           System.out.println("Would you like to continue? Yes/No");
           String answer = input.next().toLowerCase();

           if (!  (     (answer.equals("yes"))||(answer.equals("no"))   )  ) {
               System.err.println("Invalid entry");
               System.exit(1);
           }

           if (answer.equals("no")) {
               System.out.println("Thank you for using Cydeo Grade Calculator APP");
               break;
           }
       }

    input.close();
    }
}
/*
7. Write a program for the grade calculator:
                        1. Ask the user to "Enter your score"
                                If user enters an invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If the user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program

 */