package day16_nested_loop;

public class UniqueCharacters_10 {

    public static void main(String[] args) {
        String str = "aabccdeef";
        String result  = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i)==str.charAt(j)) {
                    count ++;
                }

            }
            if (count==1) {
                result +=str.charAt(i);
            }
        }

        System.out.println(result); //bdf
    }
}
/*
10. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

                        Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
                        if frequency of a character == 1  =========> unique
 */