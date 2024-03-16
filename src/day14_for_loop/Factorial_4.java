package day14_for_loop;

public class Factorial_4 {
    public static void main(String[] args) {

      factorial(5);

    }

    public static void factorial(int num) {
            int result =1;
        for (int i = 1; i <=5; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */