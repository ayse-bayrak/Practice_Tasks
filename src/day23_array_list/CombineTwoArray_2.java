package day23_array_list;
import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArray_2 {
    public static void main(String[] args) {

        String[]  arr1 = {"A", "B", "C"};
        String[]  arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        System.out.println(list);//[A, B, C, D, E, F, G]

        /* Muhtar's approach

        for (String each : arr1) {
            list.add(each);
        }

        for (String each : arr2) {
            list.add(each);
        }
         */
    }


}
/*
write a program that can combine two String arrays into one ArrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};

                output:
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */