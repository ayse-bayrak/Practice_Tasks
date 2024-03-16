package day09_scanner_class;

import java.util.Scanner;

/*
9. Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask the user to enter a math operator (char)
		- Ask the user to enter the second number

		- print the calculation result,
		- if the operator is not a valid math operator (+, -, *, /), then print "Invalid entry"
 */
public class Calculator_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number");
        double num1 = input.nextDouble();

        System.out.println("enter the second number");
        double num2 = input.nextDouble();

        System.out.println("enter a math operator");
        char operator = input.next().charAt(0);

      /*
      with if "invalid operator"
            if (!(operator=='+'||operator=='-'||operator=='/'||operator=='!'))
        {
            System.out.println("invalid operator");
        }*/

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("invalid operator");
                break;

        }

    }
}
