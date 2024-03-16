package day20_arrays_continue_for_each;

import java.util.Arrays;

public class CountOddEven_Task2 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int countOdd = 0;
        int countEven = 0;
        for (int each : num) {
            if(each%2 != 0 ){
                countOdd++;
            }else {
                countEven++;
            }
        }
        System.out.println(Arrays.toString(num) +" has "+countEven+" even numbers and "+countOdd+" odd numbers");
    }
}
/*
2.  Write a program that can count the even and odd numbers from an array of integers

			Note: MUST use for each loop
 */