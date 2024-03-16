package day11_string_methods;

import java.util.Scanner;

public class ReplaceX_3 {
    public static void main(String[] args) {
        System.out.println("enter a word");//xcodex
        String word = new Scanner(System.in).nextLine();
        //acodex
        word = word.replace('x','a');
            System.out.println(word);
    }
}
/*
3. Creat a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
