package ayse_working;

import java.util.Scanner;

public class QuestionAnsweChannel {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter username and password");
//        String userName = input.nextLine();
//        String password = input.next();
//
//        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")){
//            System.out.println("You are logged in");
//        }else {
//            System.out.println("Incorrect username or password");
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your email address:");
        String emailAddress = scan.nextLine();
        scan.close();


        if (emailAddress.contains("_")) {
            int underScoreIndex = emailAddress.indexOf("_");
            int endIndex = emailAddress.indexOf("@");
            int dotIndex = emailAddress.indexOf(".");

            String firstName = emailAddress.substring(0, underScoreIndex);
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
            String lastName = emailAddress.substring(underScoreIndex + 1, endIndex);
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
            String domainName = emailAddress.substring(endIndex + 1, dotIndex);

            System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nDomain: " + domainName);
        }else {
            System.out.println("Not a valid email address");


        }
    }
    }