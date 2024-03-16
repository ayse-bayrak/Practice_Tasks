package ayse_working.GroupMeeting.week10_meeting;

import java.util.ArrayList;
import java.util.Arrays;

public class CountDuplicateChar {
    public static void main(String[] args) {

        String word = "abcde";
        duplicateChar(word);//0 # no characters repeat more than once

        word = "aabbcde";
        duplicateChar(word);//a occurs 2 times b occurs 2 times

        word = "aabBcde";
        duplicateChar(word);//a occurs 2 times b occurs 2 times

        word = "indivisibility";
        duplicateChar(word);//i occurs 6 times

        word = "Indivisibilities";
        duplicateChar(word);//i occurs 7 times s occurs 2 times

        word = "aA11";
        duplicateChar(word);//a occurs 2 times 1 occurs 2 times

        word = "ABBA";
        duplicateChar(word);//a occurs 2 times b occurs 2 times
    }

    public static void duplicateChar(String word) {

        String[] str1 = word.toLowerCase().split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str1));

        int countDuplicate = 0;
        String result = "";

        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            for (int i1 = 0; i1 < list.size(); i1++) {

                if (list.get(i).equals(list.get(i1))) {
                    count++;
                }
            }

            if (count > 1 && !result.contains(list.get(i))) {
                countDuplicate++;
                result += list.get(i) + count;
            }
        }
        if (countDuplicate == 0) {
            System.out.print(countDuplicate + " # no characters repeat more than once");
        }

        for (int i = 0; i < result.length(); i += 2) {
            System.out.print(result.charAt(i) + " occurs " + result.charAt(i + 1) + " times ");
        }
        System.out.println();
    }
}
/*
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric
digits that occur more than once in the input string.

The input string can be assumed to contain only
alphabets (both uppercase and lowercase) and numeric digits.
Examples:
"abcde" -> 0 # no characters repeat more than once.
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice ('b' and 'B')
"indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice.
 */