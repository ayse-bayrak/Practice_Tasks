package day16_nested_loop;

public class Shape_1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {

            for (int j = 0; j < i+1; j++) {

                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
/*
Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */