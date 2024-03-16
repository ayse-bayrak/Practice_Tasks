package day23_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.addAll(list);
        System.out.println(list);//[1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
    }
}
/*
Write a program that can duplicate the elements of an ArrayList
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5
 */