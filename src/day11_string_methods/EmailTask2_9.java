package day11_string_methods;

import java.util.Scanner;

public class EmailTask2_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scan.nextLine();
        //       "craig_federighi@gmail.com"
        //index   012345678910.........
        scan.close();

        if(email.contains("_")) {
            int f = email.indexOf('_');//5
            String firstName = email.substring(0,f);

            firstName = (""+ firstName.charAt(0)).toUpperCase()+firstName.substring(1);

            String lastName = email.substring(f+1,email.indexOf('@'));

            lastName = (""+lastName.charAt(0)).toUpperCase()+ lastName.substring(1);

            String domain =email.substring(email.indexOf('@')+1,email.indexOf('.'));

            String newEmail = lastName + "_" +firstName + domain;

            //*** The above solution is much better
            // firstname1 = firstname1.toUpperCase();
            //System.out.println(firstname1);
            //String firstname2 = firstName.substring(1);
            //System.out.println(firstname2);
           // firstName= firstname1+firstname2;
            //System.out.println(firstName);
            //         String lastname1 = lastName.substring(0,1);
//            lastname1 = lastname1.toUpperCase();
//            //System.out.println(firstname1);
//            String lastname2 = lastName.substring(1);
//            //System.out.println(firstname2);
//            lastName= lastname1+lastname2;
//            //System.out.println(firstName);
//
//            //System.out.println("Last Name: "+ lastName);
//            String domain =email.substring(email.indexOf('@')+1,email.indexOf('.'));
//            //System.out.println("Domain: "+ domain);
//            String newEmail = lastName + "_" +firstName + domain;

            System.out.println("First Name: "+ firstName);
            System.out.println("Last Name: "+ lastName);
            System.out.println("Domain: "+ domain);

        }
        else {
            System.out.println("the given input email");
        }
    }
}
/*
Create a class called EmailTask2.

   Assume that the email address is constructed by the person's first name and
   followed by an underscore and last name.

   Write a program that will print out information about the user based on email.
   Print first name, last name, and domain.

   First and Last names should be printed in the proper format -
   uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com
            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple

 */