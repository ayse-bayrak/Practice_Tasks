package day24_date_time;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllDigits_2 {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

                list.removeIf(p-> Character.isDigit(p));//removeIf and wrapper class isDigit method

        System.out.println(list);//[$, A, B, C, D, @, !]

    }
}
/*
Write a program that can remove all the digits from an ArrayList of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$', A', 'B', 'C', 'D', '@', '!']

	Note: DO NOT use any loops
 */