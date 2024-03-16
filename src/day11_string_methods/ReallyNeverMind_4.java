package day11_string_methods;

import java.util.Scanner;

/*
Create a class named ReallyNeverMind. Ask the user to enter a word.
If the word ends with "ly", print "really???",
otherwise, print "never mind"
 */
public class ReallyNeverMind_4 {
    public static void main(String[] args) {
        System.out.println("enter a word");//friendly
        String word = new Scanner(System.in).nextLine();


        //if (word.substring(word.length()-2).equalsIgnoreCase("ly"))
            // it could be like this but the other one is better
        if (word.endsWith("ly"))
        {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }


    }
}
