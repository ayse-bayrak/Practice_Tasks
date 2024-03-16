package day19_array_intro;

import java.util.Arrays;

public class MoveZero_7 {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};

        int[] arrayLastZero = new int[array.length];
//
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 0) {
                arrayLastZero[j++] = array[i];

            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayLastZero));
    }
}
/*
7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */