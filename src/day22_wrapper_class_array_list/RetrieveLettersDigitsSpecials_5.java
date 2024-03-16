package day22_wrapper_class_array_list;

public class RetrieveLettersDigitsSpecials_5 {
    public static void main(String[] args) {
        String word  = "Wooden Spoon!";
        String digit ="";
        String letters ="";
        String special ="";

        for (char each : word.toCharArray()) {

            if (Character.isDigit(each)) {
                digit += ""+ each;
            }
            else if (Character.isLetter(each)) {
                letters += ""+ each;
            } else {
                special += ""+ each;
            }

        }
        System.out.println("special = " + special); // @#!
        System.out.println("letters = " + letters);// mnAb
        System.out.println("digit = " + digit); // 123

    }

}
/*
Write a program that can retrieve the letters, digits, and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods
 */