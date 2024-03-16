package day15_loops_continue;

import java.util.Scanner;

public class FrequencyOfChar_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = input.nextLine().toLowerCase();
        System.out.println("Please enter a char");
        char ch = input.next().charAt(0);
        char ch1 =Character.toLowerCase(ch); // The Java Character toLowerCase() method converts the character
        // (Unicode code point) argument to lowercase using case mapping information from the UnicodeData file.

        int frequency = 0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==ch1) {
                frequency ++;
            }
        }

        System.out.println("frequency = " + frequency);
        input.close();
    }
}
/*
3. Create a class named FrequencyOfChar and Write a program that asks the user to enter a string and a char,
which returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */