package day24_date_time;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllLetters_3 {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p-> Character.isLetter(p));

        System.out.println(list);//[$, 1, 2, @, !, 3, 4]

    }
}
/*
3. Write a program that can remove all the letters from an ArrayList of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$',  '1', '2', '@', '!', '3', '4']
 */