package day08_ternary_switch_practice;
/*
6. Create a class called BiggerNum, and write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1, n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */
public class BiggerNum_6 {
    public static void main(String[] args) {
        int n1=13, n2=15, n3=8;
        String result=(n1>n2&&n1>n3)?"n1 is bigger":(n2>=n1&&n2>=n3)?"n2 is bigger":"n3 is bigger";
        System.out.println(result);
    }
}
