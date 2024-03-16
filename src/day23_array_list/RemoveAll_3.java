package day23_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));

        list.removeAll(Arrays.asList("Ahmed"));

        System.out.println(list);//[John, Daniel, James, Muhammed]

    }
}
/*
Write a program that can remove all the names "Ahmed" from an ArrayList of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];

 */