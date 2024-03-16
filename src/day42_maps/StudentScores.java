package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class StudentScores {
    public static void main(String[] args) {
        // Create a map to store student names and scores
        Map<String, int[]> studentMap = new HashMap<>();

        // Add at least 5 pairs into the map
        studentMap.put("Alice", new int[]{85, 90, 92, 88, 87});
        studentMap.put("Bob", new int[]{78, 85, 80, 92, 88});
        studentMap.put("Charlie", new int[]{95, 89, 94, 91, 87});
        studentMap.put("David", new int[]{82, 78, 85, 88, 90});
        studentMap.put("Eva", new int[]{90, 92, 91, 87, 89});

        // Display each student name and scores
        for (Map.Entry<String, int[]> entry : studentMap.entrySet()) {
            String studentName = entry.getKey();
            int[] scores = entry.getValue();

            System.out.println("Student: " + studentName);
            System.out.print("Scores: ");
            for (int score : scores) {
                System.out.print(score + " ");
            }
            System.out.println("\n");
        }
        /*
        Student: Eva
        Scores: 90 92 91 87 89

        Student: Bob
        Scores: 78 85 80 92 88

        Student: Alice
        Scores: 85 90 92 88 87

        Student: Charlie
        Scores: 95 89 94 91 87

        Student: David
        Scores: 82 78 85 88 90
         */
    }
}
