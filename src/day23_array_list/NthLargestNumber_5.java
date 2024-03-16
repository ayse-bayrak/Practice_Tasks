package day23_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber_5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        /*
        Muhtar's approach, SUPER

        int n = 3;

        for (int i = 1; i < n; i++) {
            list.removeIf(p -> Collections.max(list) == p);
        }

        System.out.println(Collections.max(list));
         */

        int n = 5;
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        for (Integer each : list) {

            if (list1.contains(each)) {
                continue;
            }
            list1.add(each);
        }
        System.out.println(list1);
        System.out.println(list1.get(n-1));
    }
}
/*
5. write a program that can return the nth largest number from an ArrayList
            ex:
	            ArrayList = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */