package day06_if_statement_intro_practice_tasks;
/*
3. Create a class called Calculator; given
two double variables named n1 & n2, and a char variable named mathOperator,
write a program that can calculate the result of n1&n2 based on the given math Operator.
		char operator -> -, +, *, /
		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */
public class Calculator_3 {
    public static void main(String[] args) {
        double n1 = 10, n2 = 20;
        char mathOperator = '/';
        double result=0;
        if (mathOperator == '+') {
            result = n1 + n2;
        }
        else if (mathOperator == '-') {
            result = n1 - n2;
        }
        else if (mathOperator == '*') {
            result = n1 * n2;
        }
        else if (mathOperator == '/') {
            result = n1 / n2;
        }else {
            System.out.println("invalid operator");
        }
        System.out.println(result);

    }
}
