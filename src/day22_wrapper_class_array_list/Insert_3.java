package day22_wrapper_class_array_list;

import java.util.Arrays;

public class Insert_3 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(insert(arr, 2, 100)));
    }

    public static int[] insert(int[] array, int index, int element) {
        int[] newArray = new int[array.length + 1];// 0, 0, 0, 0, 0

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                newArray[i] = element;//i==2
                i = array.length;
            } else {
                newArray[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));

        for (int i = index+1; i < newArray.length; i++) {

            newArray[i] = array [i-1];
        }
        return newArray;
    }

    public static double[] insert(double[] array, int index, double element) {
        double[] newArray = new double[array.length + 1];// 0, 0, 0, 0, 0

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                newArray[i] = element;//i==2
                i = array.length;
            } else {
                newArray[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));

        for (int i = index+1; i < newArray.length; i++) {

            newArray[i] = array [i-1];
        }
        return newArray;
    }

    public static char[] insert(char[] array, int index, char element) {
        char[] newArray = new char[array.length + 1];// 0, 0, 0, 0, 0

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                newArray[i] = element;//i==2
                i = array.length;
            } else {
                newArray[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));

        for (int i = index+1; i < newArray.length; i++) {

            newArray[i] = array [i-1];
        }
        return newArray;
    }
}

/*
3. Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array,
        integer index, and integer element. the method inserts the given element into the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array, and string array
 */