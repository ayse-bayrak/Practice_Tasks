package day06_if_statement_intro_practice_tasks;
/*
5. Create a class named CharacterIdentity,
and write a program that can identify
if the given character is a digit or
Alphabetic Character(A~Z or a~Z) or a special character
		Ex:
			ch = '@'
		output:
			Special Character
			ch = '1'
		output:
			digit
		HINT: You may wanna check out
		the numbers of the characters on ASCII table
 */
public class CharacterIdentify_5 {
    public static void main(String[] args) {
        char c = '#';
        String result = "--";

        if ((c>=65&&c<=90)||(c>=97&&c<=122)){
            result = "Alphabetic Character";
        }
        else if (c>=47&&c<=57) {
            result = "Digit";
        }
        else result = "Special Character";

        System.out.println(result);
    }
}
