package day42_maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentsEachGroup_4 {
    public static void main(String[] args) {
        String[] group1 = {"Ayse", "Ziya"};
        String[] group2 = {"Akif", "Mahir", "Betul"};
        String[] group3 = {"Emine", "Fatma", "Hatice", "Davut"};
        String[] group4 = {"Ganime", "Mehmet"};
        String[] group5 = {"Sehri", "Fatima"};

        Map<Integer, String[]> groups = new LinkedHashMap<>();
        groups.put(0, group1);
        groups.put(1, group2);
        groups.put(2, group3);
        groups.put(3, group4);
        groups.put(4, group5);

        for (String each : groups.get(1)) {
            System.out.println(each);
        }
        for (Map.Entry<Integer, String[]> eachEntry : groups.entrySet()) {
            System.out.println("=========================");
            System.out.println("Group id " + eachEntry.getKey() + ": ");
            for (String each : eachEntry.getValue()) {
                System.out.print(each + ", ");
            }
            System.out.println();

        }



    }
}
/*
Given the following arrays that contains the names of the students from each group:
	        String[] group1 = {};
	        String[] group2 = {};
	        String[] group3 = {};
	        String[] group4 = {};
	        String[] group5 = {};

	    4.1 Create a map that contains group id and names of group members

	            Map<Integer, String[]> groups = new LinkedHashMap();

	        add all the group 1d and group members into the map named groups

	    4.2 Display the names of each student with group id of 1

	    4.3 Display the names of each student from each groups


 */