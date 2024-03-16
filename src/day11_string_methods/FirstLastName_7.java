package day11_string_methods;

import java.util.Scanner;

public class FirstLastName_7 {
    public static void main(String[] args) {
        System.out.println("Enter your first name");
        String firstName = new Scanner(System.in).nextLine();
        System.out.println("Enter your last name");
        String lastName = new Scanner(System.in).nextLine();

        firstName = (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1);// It makes a string with sign ""
        lastName = (""+ lastName.charAt(0)).toUpperCase() + lastName.substring(1);// It makes a string with sign ""
        System.out.println(firstName+" "+lastName);

//       ****The above solution is much better***

//        firstName = firstName.toLowerCase();//ayse
//        String firstName1 = firstName.substring(0,1);//a
//        String firstName2 =firstName.substring(1);//yse
//        firstName1= firstName1.toUpperCase();//A
//        firstName = firstName1 + firstName2;//A yse
//        //System.out.println(firstName);//for check
//
//        lastName = lastName.toLowerCase();//bayrak
//        String lastName1 = lastName.substring(0,1);//b
//        String lastName2 =lastName.substring(1);//ayrak
//        lastName1= lastName1.toUpperCase();//B
//        lastName = lastName1 + lastName2;//Bayrak
//        //System.out.println(lastName);// for check

        System.out.println(firstName + " " + lastName);

    }
}
/*
7. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

        input:
        firstName = "cyDEo"
        lastName = "SCHOOL";

        output:
        Cydeo School*/