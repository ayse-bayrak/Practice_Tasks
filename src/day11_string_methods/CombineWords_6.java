package day11_string_methods;

import java.util.Scanner;

public class CombineWords_6 {
    public static void main(String[] args) {
        System.out.println("Enter your two words");
        String word1 = new Scanner(System.in).nextLine();
        String word2 = new Scanner(System.in).nextLine();

        char a =(word1.charAt((word1.length())-1));
        char b =word2.charAt(0);

        if(a==b) {
            //String word3 = word2.substring(1);// it doesn't necesarry
            System.out.println(word1+word2.substring(1));
        }else {
            System.out.println(word1+word2);
        }
        /* Adilijiang Ainiwaer solution

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first word:");
        String firstWord = input.nextLine();
        System.out.println("Please enter second word:");
        String secondWord = input.nextLine();
        input.close();;

        char lastCharFirstWord = firstWord.charAt(firstWord.length() - 1);
        char firstCharSecondWord = secondWord.charAt(0);

        if (lastCharFirstWord == firstCharSecondWord){
            System.out.println(firstWord+(secondWord.substring(1)));
        }else {
            System.out.println(firstWord+secondWord);
        }
        */
    }
}



/*
Create a class named CombineWords.
Ask the user to enter two words.
Then add them together and print.
    But if the last letter of the first word and
    the first letter of the last letter are the same,
    print that character once.
                Input:
                    one
                    eight
                Output:
                    oneight
 */