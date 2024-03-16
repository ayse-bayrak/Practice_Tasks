package ayse_working.GroupMeeting.week19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamtask {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        System.out.println("List of numbers/average: " + nums);
        Double average = nums.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(average);//11.714285714285714

        Double average2 = nums.stream().mapToInt(Integer::intValue).average().orElseThrow();
        System.out.println(average2);//11.714285714285714

        System.out.println("=======================================================");

        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        List<String> colors3 = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
        System.out.println("List of strings: " + colors3);

        //count the number of strings in a list that start with a specific letter

        long countNums= colors.stream()
                .filter(names-> names.startsWith("B"))
                .count();
        System.out.println(countNums);

        //a list of strings to uppercase
        List<String> listString=colors3.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(listString);
    }
    }

/*
public static void main(String[] args) {
    List< Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
    System.out.println("List of numbers: " + nums);
[11:13 PM]
List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
List < String > colors3 = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
System.out.println("List of strings: " + colors3);

1-Write a Java program to calculate the average of a list of integers using streams.
2-Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
3-Write a Java program to count the number of strings in a list that start with a specific letter using streams.
4-Write a Java program to convert a list of strings to uppercase or lowercase using streams.
 */