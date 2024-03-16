package ayse_working.GroupMeeting.week12;

import java.util.Arrays;

public class ReverseArrayInPlace {

    public static void reverseArray(int[] array) {
        int z;// for swap
        if ( !(1<=(array.length) && array.length <=1000)) {
            throw new NullPointerException("The given array is not empty");
        }
        for (int i = 0, j = array.length - 1; j >= 0; i++, j--) {
           if (i==j){ // here is half of the array
               break;
           }
            z = array[i];
            array[i]= array[j];
            array[j]=z;
        }
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        //int[] array = {150};
        reverseArray(array);
        System.out.println(Arrays.toString(array));//[5, 4, 3, 2, 1]
    }
}
/*
Write a method that reverses an array of integers in place. The reversion should be performed directly on the original array without using any additional arrays.
(Hint: not necessary to have a return type method since the modification is done in place and a swap algorithm might be a good approach)
Example 1
Input: [1, 2, 3, 4, 5] Output: [5, 4, 3, 2, 1]
Example 2
Input: [150] Output: [150]
Constraints
The given array is not empty. 1 <= nums.length <= 1000 -10^6 <= nums[i] <= 10^6
 */