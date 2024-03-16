package day42_maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Student_1 {
    public static void main(String[] args) {
        /*
        name=scores
         */

        Map<String, int[]> studentsMap = new LinkedHashMap<>();
        int[] scores1 = {50, 60, 70, 80, 90};
        int[] scores2 = {60, 80, 70, 90, 100};
        int[] scores3 = {50, 60, 70, 80, 90};
        int[] scores4 = {40, 90, 80, 55, 85};
        int[] scores5 = {55, 65, 75, 85, 95};

        studentsMap.put("Ayse", scores1);
        studentsMap.put("Ziya", scores2);
        studentsMap.put("Betul", scores3);
        studentsMap.put("Akif", scores4);
        studentsMap.put("Mahir", scores5);

        for (Map.Entry<String, int[]> eachEntry : studentsMap.entrySet()) {
            System.out.print(eachEntry.getKey() + " = ");
            System.out.println(Arrays.toString(eachEntry.getValue()));
        }
        /*
        Ayse = [50, 60, 70, 80, 90]
        Ziya = [60, 80, 70, 90, 100]
        Betul = [50, 60, 70, 80, 90]
        Akif = [40, 90, 80, 55, 85]
        Mahir = [55, 65, 75, 85, 95]
        */

    }
}


/*
1. Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores
 */