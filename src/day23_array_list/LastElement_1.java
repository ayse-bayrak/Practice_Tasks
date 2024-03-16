package day23_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class LastElement_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));// adding multiple elements


        list.set(list.size()-1,0 );
        System.out.println(list);//[1, 2, 3, 4, 0]
    }
}
/*
1. write a program that can set the last element of the Integer ArrayList to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];

 */