package ayse_working.GroupMeeting.week21;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "Do geese see God?";
        String s1 = "Was it a car or a cat I saw?";
        String s2 = "A brown fox jumping over";
        String s3 = "0P";
//        System.out.println(isPalindrome(s));// true
//        System.out.println(isPalindrome(s1));// true
//        System.out.println(isPalindrome(s2));// false
        System.out.println(isPalindrome1(s3));
        System.out.println(twoPointerRegex(s3));
        System.out.println(twoPointerStrBuilder(s3));
    }

    public static boolean isPalindrome1(String s) {
        String cleanPhrase = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        return cleanPhrase.equals(new StringBuilder(cleanPhrase).reverse().toString());
    }


    public static boolean isPalindrome(String s) {
        String sNew="";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                sNew+=s.charAt(i);
            }
        }
       s=sNew.trim().toLowerCase();
        System.out.println(s);

        for (int i = 0, j= s.length()-1 ; i < s.length()/2; i++, j--) {
            if(!(s.charAt(i)==s.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    static boolean twoPointerRegex(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else
                return false;
        }
        return true;
    }

    static boolean twoPointerStrBuilder(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        str = str.toLowerCase();                // O(n)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {    // O(n)
            if (Character.isLetterOrDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        int left = 0, right = sb.length() - 1;
        while (left < right) {                          // O(n/2) -> O(n)
            if (sb.charAt(left) == sb.charAt(right)) {
                left++;
                right--;
            } else
                return false;
        }
        return true;
    }
}
