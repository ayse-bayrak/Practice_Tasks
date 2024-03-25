package ayse_working.leet_code_problem;


import jdk.internal.math.FormattedFloatingDecimal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(lengthOfLastWord(s));
//        Arrays.stream(s.split(" "))
//                .map(s1-> new HashMap<String, Integer>().put(s1, s1.length())
//                )
//                .forEach(System.out::println);
    }

    public static int lengthOfLastWord(String str) {
        String[] strArray = str.split(" ");
        return strArray[strArray.length - 1].length();
    }
//    }
}
