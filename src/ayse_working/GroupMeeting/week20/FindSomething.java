package ayse_working.GroupMeeting.week20;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindSomething {

    public static void main(String[] args) {
        System.out.println("Question-1- FindMaxFromIntArray");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(FindMaxFromIntArray(arr));//9

        System.out.println("Question-2- FindFactorial");
        int number = 6;
        System.out.println(FindFactorial (number));//720

        System.out.println("Question-3- FirstUnique");
        String str = "success";
        System.out.println(FirstUniqueCharacter(str));//u

        System.out.println("Question-4- FrequencyOfArrayElements");
        String[] strArray = {"Apple", "Banana", "apple", "Cherry", "Apple"}; //{apple=1, Apple=2, Cherry=1, Banana=1}
        System.out.println(FrequencyOfArrayElements(strArray));

        System.out.println("Question-5- Array of Digit");
        int positive = 490;
        System.out.println(Arrays.toString(ArrayOfDigits(positive)));

    }
    public static int FindMaxFromIntArray (int[] array) {
        return Arrays.stream(array)
                .sorted().max().getAsInt();
    }

    public static int FindFactorial (int number) {
        int factorial =1;
        for (int i = number; i >=1; i--) {
            factorial *=i;
        }
        return factorial;
    }

    public static char FirstUniqueCharacter (String str) {
        char space=' ';
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency==1) {
                return str.charAt(i);
            }
        }
        return space ;
    }

    public static Map<String, Integer> FrequencyOfArrayElements(String[] array) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int frequency =0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])){
                    frequency++;
                }
                map.put(array[i], frequency);
            }
        }
        return map;
    }

    public static int[] ArrayOfDigits(int positive) {

        String intToString = Integer.toString(positive);
        int str = Integer.parseInt(intToString);

        int[] array= new int[intToString.length()];

        for (int i = 0; i < array.length; i++) {
           array[i] = Integer.parseInt(intToString.charAt(i)+"");
        }
        return array;
    }
    
}
/*
 Question-1 Find Max from int Array
Write a function that can find the maximum number from an int Array.
input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9

Question-2 Find Factorial
Write a method that returns the factorial number of any given number

3 Question-3 First Unique Character
Write a function that returns the first non-repeated character from a string.
If all characters are repeated return a space character

Example:
Input: "success" output: u
Explanation: u and e are non-repeated, u is the first non-repeated character

 Question-4 Frequency of Array Elements
 Write a function that takes a String array as parameter and returns a map object that
 contains each element of array as key and their occurence counts as value
 For calculating accurence, array elements should be checked by reharding case sensitivity
 Order is not ipmoortant
 Example
 Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}

Question-5 Array of Digits
How to convert a positive int to an array of digits.
Input: 490 Output: [4, 9, 0] (as int Array)
 */