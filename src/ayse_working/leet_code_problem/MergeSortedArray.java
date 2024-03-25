package ayse_working.leet_code_problem;

import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergeArray = new int [m+n];
        for (int i = 0; i < m; i++) {
            mergeArray[i]= nums1[i];
        }
        for (int i = 0; i < n; i++) {
            mergeArray[i+m]= nums2[i];
        }

        System.out.println(Arrays.toString(Arrays.stream(mergeArray)
                .sorted().toArray()));
        }

    }

