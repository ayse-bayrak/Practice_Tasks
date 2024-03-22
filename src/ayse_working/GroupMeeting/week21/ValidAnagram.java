package ayse_working.GroupMeeting.week21;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(validAnagram(t, s));

    }

    public boolean validAnagram(String t, String s) {

        if (!(1<=s.length()&&t.length()<=50000)) {
            return false;
        }

        Object[] t1 = Stream.of(t.split("")).sorted().toArray();
        //System.out.println(Arrays.toString(t1)); // to check
        Object[] s1 = Stream.of(s.split("")).sorted().toArray();
        //System.out.println(Arrays.toString(s1)); // to check

        return Arrays.equals(t1, s1);
    }
}
