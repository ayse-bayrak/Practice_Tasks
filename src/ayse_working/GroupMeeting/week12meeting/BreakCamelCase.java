package ayse_working.GroupMeeting.week12meeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BreakCamelCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();// "weLoveProgramming"
        String newString = "";

        if (word == null || word.isEmpty()) {
            newString = "";
        }

        for (  char each   :word.toCharArray()     ) {
            if (Character.isUpperCase(each)) {
                newString += " " + each;
            } else {
                newString += each;
            }
        }
        newString.trim();

        System.out.println(newString);
    }
}
/*
Question-1 Break Camel Case
Write a function, breakCamelCase, that takes a camel-cased string as input and returns a new string with spaces inserted between words.
The function should handle empty or null input.
Examples:
"camelCasing" => "camel Casing" "weLoveProgramming" => "we Love Programming" "identifier" => "identifier"
"" => ""
null => ""

 */