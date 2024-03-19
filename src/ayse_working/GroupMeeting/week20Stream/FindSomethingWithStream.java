package ayse_working.GroupMeeting.week20Stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindSomethingWithStream {

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
        System.out.println(Arrays.toString(ArrayOfDigits(positive)));//[4, 9, 0]

    }
    public static int FindMaxFromIntArray (int[] array) {
        return Arrays.stream(array)
                .max().orElseThrow();
    }

    public static int FindFactorial (int number) {
        return  Stream.iterate(1, i -> i + 1)
                .limit(number)  // If we do not put here limit, this stream will be the infinite stream.
                // Thanks to the limit method, we restricted the number of stream elements.
                .reduce(1,(x, y) -> x * y);
//*******************************************************************
//       return IntStream.rangeClosed(1, number)
//                .reduce(1, (x, y) -> x * y);
//       //We use IntStream.rangeClosed(1, number)
//       //to create a stream of integers from 1 to number, inclusive.

    }

    public static char FirstUniqueCharacter (String str) {

        return str.chars().mapToObj(p->(char)p)
                .filter(p->str.indexOf(p)==str.lastIndexOf(p))
                .findFirst().orElse(' ');
        //In Java 8, there is a new method :
        //String. chars() which returns a stream of int s ( IntStream ) that represent the character codes.
    }

    public static Map<String, Long> FrequencyOfArrayElements(String[] array) {
        Map<String, Integer> map = new HashMap<>();

        return Arrays.stream(array)
                .collect(Collectors
                        .groupingBy(String::toString,Collectors.counting()));
    }

    public static int[] ArrayOfDigits(int positive) {

        return String.valueOf(positive).chars()
                .map(Character::getNumericValue)
                .toArray();
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