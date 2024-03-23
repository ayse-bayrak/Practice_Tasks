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
        System.out.println(isPalindrome(s3));
    }

    public static boolean isPalindrome(String s) {


        // invalid solution for "A man, a plan, a canal: Panama" not yet Optimum solution
        s =s.toLowerCase().replace("[^a-z0-9]","");
//        s= s.chars()
//                .filter(Character::isLetter)
//                .mapToObj(c -> String.valueOf((char) c))
//                .collect(Collectors.joining());

        return s.equals(new StringBuilder(s).reverse().toString());

//        for (int i = 0, j= s.length()-1 ; i < s.length()/2; i++, j--) {
//            if (!Character.isAlphabetic(s.charAt(i))) {
//                continue;
//            }
//            if(!(s.charAt(i)==s.charAt(j))) {
//                return false;
//            }
//        }
//        return true;
    }
}
