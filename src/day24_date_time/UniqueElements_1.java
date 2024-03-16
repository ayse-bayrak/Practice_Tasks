package day24_date_time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        list.removeIf(p-> Collections.frequency(list, p)>1);

        System.out.println(list);

/* with Loop
        ArrayList<Integer> listUnique = new ArrayList<>();
        for (Integer each : list) {
           if (Collections.frequency(list, each)==1) {
               listUnique.add(each);
           }
        }
        System.out.println(listUnique);
*/

    }
}
/*
1. Write a program that can display the unique elements of an ArrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops
 */