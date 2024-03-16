package day23_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveAllZero_6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list.size());
        ArrayList<Integer> list1 = new ArrayList<>(list);

        list.removeAll(Arrays.asList(0));
        list1.retainAll(Arrays.asList(0));

        System.out.println("list1 = " + list1);// only 0
        System.out.println("list = " + list);// only not zero

        list.addAll(list1);

        /* Muhtar's approach

        int countZeros = Collections.frequency(list, 0);

        list.removeAll(Arrays.asList(0));

        for (int i = 0; i < countZeros; i++) {
            list.add(0);
        }
         */

        System.out.println("list = " + list);




//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i)==0){
//                Collections.swap(list, i, list.size()-1);
//            }
//        }

       // System.out.println(list);
    }
}
/*
Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */