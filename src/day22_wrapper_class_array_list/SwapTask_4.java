package day22_wrapper_class_array_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapTask_4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(swap(arr, 2, 4) ));// [10, 20, 50, 40, 30]
    }

    public static int[] swap(int[] array, int i, int j ) {

        for (int i1 = 0; i1 < array.length; i1++) {
            int temp = 0;
            if(i1==i) {
                temp = array [i1];
                array[i1] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }


}
/*
. Swap Task:
    2.1 Create a method named swap that passes three parameters:
    integer array, integer i, and integer j.
    The method swaps the element at index i with the element at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array, and string array
 */