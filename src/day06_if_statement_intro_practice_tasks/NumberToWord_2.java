package day06_if_statement_intro_practice_tasks;
/*
2. Create a  class named NumberToWord,
and write a Java program that can convert numbers
between 0 ~ 9 into words
			Ex:
				number = 1;
			output:
				One
		Note: Do not use more than one print statement
 */
public class NumberToWord_2 {
    public static void main(String[] args) {
        int n = 8;
        String word = "--";
        if ( n == 0) {
            word ="Zero";
        }
        if ( n == 1) {
            word = "One";
        }
        else if ( n == 2) {
            word = "Two";
        }
        else if ( n == 3) {
            word = "Three";
        }
        else if ( n == 4) {
            word = "For";
        }
        else if ( n == 5) {
            word = "Five";
        }
        else if ( n == 6) {
            word = "Six";
        }
        else if ( n == 7) {
            word = "Seven";
        }
        else if ( n == 8) {
            word = "Eight";
        }
        else if ( n == 9) {
            word = "Nine";
        }
        else  {
            word = "Invalid Number";
        }
        System.out.println(word);
    }
}
