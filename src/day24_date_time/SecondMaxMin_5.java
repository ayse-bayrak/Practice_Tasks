package day24_date_time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMin_5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        list.removeIf(p -> p == Collections.max(list) || p == Collections.min(list));// delete first max and min number at the same time

        System.out.println("Second maximum number is: " + Collections.max(list));
        System.out.println("Second minimum number is: " + Collections.min(list));
    }
    }

/*

Write a program that can display the second maximum and minimum numbers from an ArrayList of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			The second maximum number is 7
			The second minimum number is 1

	Note: DO NOT use any loops
 */