package ayse_working.GroupMeeting.week21;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram1(s, t));
        System.out.println(isAnagram2(s, t));

    }


    public static boolean isAnagram(String s, String t) { //45 mb

        if (!(1<=s.length()&&t.length()<=50000) || !(s.length()==t.length())) {
            return false;
        }

        Object[] t1 = Stream.of(t.split("")).sorted().toArray();
        //System.out.println(Arrays.toString(t1)); // to check
        Object[] s1 = Stream.of(s.split("")).sorted().toArray();
        //System.out.println(Arrays.toString(s1)); // to check

        return Arrays.equals(t1, s1);
    }

    public static boolean isAnagram1(String s, String t) { //Memory: 43.7 mb
        while(s.length()==t.length())
        {
            char a=s.charAt(0);
            s=s.replace(a+"","");
            t=t.replace(a+"","");
            if(s.length()==0 && t.length()==0){
                return true ;
            }

        }
        return false;
    }


        public static boolean isAnagram2(String s, String t) {
            char [] schar = s.toCharArray();
            char [] tchar = t.toCharArray();

            Arrays.sort(schar);
            Arrays.sort(tchar);

            return Arrays.equals(schar, tchar);
        }

}
