package day20_arrays_continue_for_each;
import utilities.StringUtility;

import java.util.Arrays;

public class ReverseSecondWord_Task1 {

    public static void main(String[] args) {
        String sentence = "I Love Java";

        String[] result = sentence.split(" ");
        System.out.println(Arrays.toString(result));

        result[1] = StringUtility.reverse(result[1]);// My custom 'StringUtility' class under the `utilities` package
        //second word's index number is 1. So we reversed result [1]

        for (String each : result) { // from the begining to the end
            System.out.print(each + " ");
        }
        //I evoL Java

        System.out.println();


        System.out.println("================My first solution============");
/*
        String [] split = sentence.split(" ");

        System.out.println(Arrays.toString(split));
        //[I, Love, Java]

        String reverse1 = "";

        for (int i = split[1].length() - 1; i >= 0; i--) {
            reverse1 +=split[1].charAt(i);
        }

        split[1] =reverse1;

        System.out.println(Arrays.toString(split));//[I, evoL, Java]

*/


    }
}
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */