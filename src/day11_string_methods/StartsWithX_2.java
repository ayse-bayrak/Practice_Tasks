package day11_string_methods;

import java.util.Scanner;

public class StartsWithX_2 {
    public static void main(String[] args) {
        System.out.println("enter a word");//xcodex
        String word = new Scanner(System.in).nextLine();
        //excepted output ===> acodex

       // if(word.startsWith("x")||word.startsWith("X")) //it could be like this
        if (word.charAt(0)=='x'||word.charAt(0)=='x')
        //if ((word.substring(word.charAt(0)).equalsIgnoreCase("x")))//it could be like this
        {
            word = word.replaceFirst("x","a");
            //I forget replaceFirst method and challenge solution what a pity
//            String sub = word.substring(0,1);
//            System.out.println(sub);
//            sub=sub.replace('x','a');
//            String sub2 =word.substring(1);
//            System.out.println(sub2);
//            System.out.println(sub+sub2);
            System.out.println(word);
        }  else System.out.println("word doesn't start with x");
    }
}
/*
2. Create a class named StartsWithX and write a program that
asks the user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */