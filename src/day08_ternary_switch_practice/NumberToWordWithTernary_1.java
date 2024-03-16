package day08_ternary_switch_practice;
/*
1. Create a class called NumberToWord,
		write a Java program that can convert numbers between 0 ~ and 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary
 */
public class NumberToWordWithTernary_1 {
    public static void main(String[] args) {
int number =1;

String word=  (number == 0)?"Zero" : (number == 1)? "one" : (number==2)? "two": (number == 3)? "three" :
        (number == 4)? "for" : (number == 5)? "five" : (number == 6)? "six":
                (number == 7)? "seven" : (number == 8)? "eight" : (number== 9)?"nine": "invalid";
        System.out.println(word);
    }
}
