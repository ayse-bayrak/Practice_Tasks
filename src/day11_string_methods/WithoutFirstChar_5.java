package day11_string_methods;

import java.util.Scanner;

public class WithoutFirstChar_5 { //apple banana
    public static void main(String[] args) {
        System.out.println("Enter your two words");

String word1 = new Scanner(System.in).nextLine();
String word2 = new Scanner(System.in).nextLine();
// it doesn't need the close scan
String word11=word1.substring(1);
String word21 = word2.substring(1);
        System.out.println(word11+word21);//ppleanana
    }
}
/*
Create a class named WithoutFirstChar.
Ask the user to enter two words.
Print the first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */