package day22_wrapper_class_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMin_8 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));//adding multiple elements at once by using bulk operation

        int max = list.get(0);
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {

           if (list.get(i) > max) {
               max = list.get(i);
           }
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
