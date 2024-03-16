package day14_for_loop;

public class Sum_3 {

    public static void main(String[] args) {

        System.out.println(sum(50));

    }
    public static int sum (int input) {
        int result = 0;
        if (input<0) {
            System.out.println("Invalid number");
        } else {
            for (int i = 1; i <= input; i++) {
                result += i;
            }
        }
        return result;}
    }

/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */