package day15_loops_continue;

public class UniqueCharacters_9 {
    public static void main(String[] args) {
        String str = "AABCCD";
        String uniqueStr = "";

        for (int i = 0; i < str.length() ; i++) {

            if(  str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)) ) {
                uniqueStr += str.charAt(i);
            }

        }

        System.out.println("str = " + str);
        System.out.println("uniqueStr = " + uniqueStr);

    }
}
/*
9. Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	        Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are the same, then it's a unique

 */