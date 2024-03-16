package ayse_working.ChatGPT;

public class MaxElement {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 7, 2, 15, 8, 20};

        int max = numbers[0];
        for (int each : numbers) {
            if (each> max) max = each;
        }
        System.out.println("The maximum element in the array is: " + max);

    }
}
/*
Write a Java program that finds the maximum element in an array of integers.
You can initialize the array manually or take user input.
 */