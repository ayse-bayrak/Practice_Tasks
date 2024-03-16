package day14_for_loop;

public class sumOfDigits_6 {
    public static void main(String[] args) {
        String input ="A1B2C3";
        int result = sumOfDigits(input);
    }

    public static int sumOfDigits(String word) {

        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                result += word.charAt(i) - '0';
            }
        }
        System.out.println("result = " + result);
        return result;
    }
}

/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */