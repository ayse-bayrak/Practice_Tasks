package day24_date_time;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFirstLastSame_7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        list.removeIf(  p-> (p.toLowerCase().charAt(0)==p.toLowerCase().charAt(p.length()-1))  );

        // Muhtar's approach
        // list.removeIf(p -> p.substring(0, 1).equalsIgnoreCase(p.substring(p.length() - 1)));

        System.out.println(list);
    }
}
/*
Write a program that can remove string elements from an ArrayList if the first and last characters of the string are the same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]

 */