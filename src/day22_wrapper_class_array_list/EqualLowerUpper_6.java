package day22_wrapper_class_array_list;

public class EqualLowerUpper_6 {

    public static void main(String[] args) {

        String str = "JAVA java";
        int l = 0;
        int u = 0;

        for (int i = 0; i < str.length() ; i++) {

            boolean isLowerCaseLetter = Character.isLowerCase(str.charAt(i));//true
            boolean isUpperCaseLetter = Character.isUpperCase(str.charAt(i));//true
            if(isLowerCaseLetter) {
                l++;
            }
            if (isUpperCaseLetter) {
                u++;
            }
        }
        System.out.println(l==u);



    }
}
/*
Write a program that returns true if the total number of
uppercase characters is equal to the total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods
 */