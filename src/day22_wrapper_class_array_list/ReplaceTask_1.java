package day22_wrapper_class_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceTask_1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] newArray = replace(arr, 2, 30 );

        System.out.println("Modified array is: " + Arrays.toString(newArray));//[1, 2, 30, 4, 5]


    }
    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement) {

        // Check if the index is within the valid range
        if (index < 0 || index > array.length-1) {
            System.err.println("Invalid index. No replacement performed.");
            System.exit(0);
        }

        array[index] = newElement; // Replace the element at the specified index
        return array;
    }

    public static double[] replace(double[] array, int index, double newElement) {
        array[index]= newElement;
        return array;
    }
    public static char[] replace(char[] array, int index, char newElement) {
        array[index]= newElement;
        return array;
    }

}
/*
1. Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, and integer newElement.
        The method replaces the element of the array at the given index with the new element and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays
 */