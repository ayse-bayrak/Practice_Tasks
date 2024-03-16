package day20_arrays_continue_for_each;
import utilities.StringUtility;
public class Palindromes_Task4 {
    public static void main(String[] args) {

        String[] palindromes = {"anna", "level", "Java"};
        int count=0;
        for (String each : palindromes) {
            if(each.equals(StringUtility.reverse(each))) {
                System.out.println(each);
                count++;
            }
        }
        System.out.println("Numbers of Palindromes  = " + count);
    }
}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */