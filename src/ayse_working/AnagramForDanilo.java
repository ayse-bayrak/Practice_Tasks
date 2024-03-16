package ayse_working;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramForDanilo {

    public static boolean Anagram(String a, String b) {

        char ch1[] = a.toCharArray();
        char ch2[] = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean isAnagram = Arrays.equals(ch1, ch2);
        System.out.println("isAnagram = " + isAnagram);
        return isAnagram;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two words?");
        String a = scan.next();
        String b = scan.next();
        scan.close();
        System.out.println( (Anagram(a, b)) ? "Anagrams" : "Not Anagrams" );
    }
}
