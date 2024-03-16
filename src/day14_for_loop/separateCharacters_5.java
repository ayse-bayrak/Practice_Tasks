package day14_for_loop;

public class separateCharacters_5 {
    public static void main(String[] args) {

        separateCharacters(" mn@#123Ab!");
    }
    public static void separateCharacters(String word) {

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if ((ch >= 'A' && ch<= 'Z')||( ch >= 'a' && ch<='z'))
            {
                letters += ch;
            } else if ((ch >= '0' && ch <= '9')) {
                digits += ch;
            } else {
                if(ch != ' ')
                    {
                        specialChars += ch;
                    }
            }
        }

        System.out.println("letters: " +letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
/*
5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */