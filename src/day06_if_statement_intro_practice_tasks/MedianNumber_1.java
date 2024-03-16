package day06_if_statement_intro_practice_tasks;
/*
1. Create a class named MedianNumber.
write a program that can find the median number
between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */
/*
        I saw this code on the stackoverflow
        int median(int a, int b, int c) {
    if ( (a - b) * (c - a) >= 0 ) // a >= b and a <= c OR a <= b and a >= c
        return a;
    else if ( (b - a) * (c - b) >= 0 ) // b >= a and b <= c OR b <= a and b >= c
        return b;
    else
        return c;
}
         */
public class MedianNumber_1 {
    public static void main(String[] args) {
        int a = 100, b = 120, c = 200;
        String result = "--";
        if ((a > b && a < c) || (a > c && a< b)){
            result = "a";
        }
        else if((b > a && b< c) || (b > c && b < a)) {
            result = "b";
        }
        else if ((c > a && c < b) || (c > b && c < a)) {

            result = "c";
        }
        System.out.println(result + " is the median number");

    }
}
