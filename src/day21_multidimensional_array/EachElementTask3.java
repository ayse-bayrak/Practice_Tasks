package day21_multidimensional_array;

import java.util.Arrays;

public class EachElementTask3 {
    public static void main(String[] args) {
        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        for (String[][][][][][][][][] each9DArray : array) {
            for (String[][][][][][][][] each8DArray : each9DArray) {
                for (String[][][][][][][] each7DArray : each8DArray) {
                    for (String[][][][][][] each6DArray : each7DArray) {
                        for (String[][][][][] each5DArray : each6DArray) {
                            for (String[][][][] each4DArray : each5DArray) {
                                for (String[][][] each3DArray : each4DArray) {
                                    for (String[][] each2DArray : each3DArray) {
                                        for (String[] each1DArray : each2DArray) {
                                            for (String eachElement : each1DArray) {
                                                System.out.println(eachElement);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(array[0][0][0][0][0][0][0][0][0]));

    }
}
/*
Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can display each element of the given array
 */