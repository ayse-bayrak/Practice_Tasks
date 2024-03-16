package ayse_working.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Conversion {
    public static void main(String[] args) {
        //String to Array

        String str = "aaabbbbccccc";

        String[] str1 = str.split(""); // array {a, a, a, b, b, b, b, c, c, c, c}

        //Array to Collection / to Array List
        System.out.println(Arrays.toString(str1));

        ArrayList<String> str2 = new ArrayList<>(Arrays.asList(str1) );

        System.out.println(str2); //[a, a, a, b, b, b, b, c, c, c, c, c]

        //Array List to Array
        String[] a = str2.toArray(new String [0]);
        System.out.println(Arrays.toString(a));

    }
}
