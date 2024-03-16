package day19_array_intro;

import java.util.Arrays;

public class Reverse_6 {
    public static void main(String[] args) {
      //  String[] planets  = {"Mercury", "Venus", "Earth", "Mars"};
        int[] array = {1, 2, 3, 4, 5};

        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        System.out.println(Arrays.toString(reversedArray));

    }
}
/*
Write a program that can reverse an array of integers and return it as a new array
        Ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */