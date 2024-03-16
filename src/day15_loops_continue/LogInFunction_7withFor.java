package day15_loops_continue;

import java.util.Scanner;

public class LogInFunction_7withFor {
    public static void main(String[] args) {

        String userName = "Cydeo";
        String password = "Cydeo123";
        int attempts = 3;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your credentials, firstly enter your user name");
        String enteredUserName = input.next();
        System.out.println("enter your password");
        String enteredPasword = input.next();

        if(userName.equals(enteredUserName) && password.equals(enteredPasword)) {
            System.out.println("Logged in.");

        } else {
            for (int i = 0; i < 3; i++) {
                System.err.println("You have " + (3-i) + " attempts to correct credentials, firstly enter your user name");
                System.out.println("Enter your user name");
                enteredUserName = input.next();
                System.out.println("Enter your password");
                enteredPasword = input.next();

                if((userName.equals(enteredUserName) && password.equals(enteredPasword))) {
                    System.out.println("You are now logged in");
                    break;
                }
            }

            if(!(userName.equals(enteredUserName) && password.equals(enteredPasword))) {
                System.err.println("You are now locked, please contact to support team");
            }

        }
        input.close();
    }
}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user
                to have three attempts to enter the correct credentials,
                and if all three attempts fail, then print "Your account is locked."
 */