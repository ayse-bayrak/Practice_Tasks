package day11_string_methods;

public class EmailTask1_8 {
    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com";
        //      index   012345678910.........

        if(email.contains("_")) {
            int f = email.indexOf('_');//4
        String firstName = email.substring(0,4);
        //System.out.println(firstName);
        String lastName = email.substring(f+1,email.indexOf('@'));
        //System.out.println(lastName);
        String domain =email.substring(email.indexOf('@'));
        //System.out.println(domain);
            String newEmail = lastName + "_" +firstName + domain;
            System.out.println(newEmail);
       }
        else {
            System.out.println("the given input email");
        }

    }

}
/*
Create a class called EmailTask1.
   Assume that the email address is constructed by the person's first name and
   followed by an underscore and last name.

    Write a program that can swap the first name with the last name in the email
    (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */