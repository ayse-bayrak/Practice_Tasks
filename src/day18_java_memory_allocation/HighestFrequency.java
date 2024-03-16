package day18_java_memory_allocation;

public class HighestFrequency {
    public static void main(String[] args) {

        String str = "aaabbccccddeeee";
        int highestF = 0;
        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            int f =0;
            char each = str.charAt(i); //for one bye one check
            for (int j = 0; j < str.length(); j++) {//
                char ch = str.charAt(j);
                if (each==ch) { //if i character equal to j character, increasing frequency
                    f++;
                }
            }
            //end of check full character, check for the highest frequency and not contains results
            if ( (f>highestF) && (!result.contains(""+each))) {
                highestF = f;
                result  =""+each;
            }
             if ((f==highestF) && (!result.contains(""+each))) { // maybe one more time reach the highest frequency
                                                                // and then add to nextline of result, because expected output that like
                 result += "\n" +each;
             }
        }
        System.out.println(result);
    }

}
/*
1. Write a program that can return the character that has the highest frequency from a string
        Ex:
        str = "aaabbccccddeeee"

        output:
        c
        e

 */