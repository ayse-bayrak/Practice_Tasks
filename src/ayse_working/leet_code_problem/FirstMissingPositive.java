package ayse_working.leet_code_problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        int[] nums1 = {3, 4, -1, 1};
        int[] nums2 = {7, 8, 9, 11, 12};

        System.out.println(firstMissingPositive(nums));
        System.out.println(firstMissingPositive(nums1));
        System.out.println(firstMissingPositive(nums2));
    }

    public static int firstMissingPositive(int[] nums) {
        // Add all positive integers in the array to the HashSet
HashSet<Integer> set = new HashSet<>(); // 0(n)
        //Iterating through the input array to add positive integers to the HashSet:
        // This operation takes O(n), where n is the number of elements in the input array.
        for (int num : nums ) {
            if(num>0) {
                set.add(num);
            }
        }
/*Iterating through positive integers starting from 1 until finding the smallest missing positive integer:
In the worst case, this loop iterates up to Integer.MAX_VALUE,
which is bounded by a constant. So, we can consider this operation as O(1).*/

        for (int i = 1; i <=Integer.MAX_VALUE  ; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}

/*
Time Complexity O(n)
* Overall, the time complexity of the code is O(n)
* since the dominant factor is the iteration through the input array.*/


/*Space Complexity O(n)

 The HashSet is used to store positive integers from the input array.
 In the worst case, if all positive integers up to the maximum possible value are present in the array,
 the HashSet would store all of them. Thus, the space complexity of the HashSet is O(n),
 where n is the number of elements in the input array.

 Additionally, there is some constant space usage for variables and loop counters.
 Therefore, the space complexity of the code is O(n).

*/

/*
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.

 */