package day09_scanner_class;

import java.util.Scanner;

public class CentsToDollars_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cents = 335;
        int dolar = cents/100;
        int resultCents = cents%100;
        System.out.println(cents + " cents equal to "+ dolar + " dollars and " + resultCents + " cents");
    }
}
