package day06_if_statement_intro_practice_tasks;

import java.util.Scanner;

public class NetIncomeCalc_GPT {

    public static void main(String[] args) {
        // Taking input for salary and marital status
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Are you married? (true/false): ");
        boolean isMarried = scanner.nextBoolean();
        scanner.close();

        // Calculating net income
        double netIncome = calculateNetIncome(salary, isMarried);

        // Displaying the result
        System.out.println("Net Income: $" + netIncome);
    }

    private static double calculateNetIncome(double salary, boolean isMarried) {
        // Applying tax rates based on salary
        double taxRate;
        if (salary >= 130000) {
            taxRate = 0.35;
        } else if (salary >= 100000) {
            taxRate = 0.3;
        } else if (salary >= 80000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.2;
        }

        // Applying marriage discount if married
        if (isMarried) {
            taxRate -= 0.05;
        }

        // Calculating net income
        double netIncome = salary * (1 - taxRate);
        return netIncome;
    }
}
