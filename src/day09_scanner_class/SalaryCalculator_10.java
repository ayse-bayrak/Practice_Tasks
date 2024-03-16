package day09_scanner_class;

import java.util.Scanner;

/*
10. Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourly rate
		- Ask the user how many hours he/she works in a week
		- Ask the user to enter state tax (in percentage)
		- Ask the user to enter federal tax (in percentage)

         -Calculate the:
                   salary
                   State tax
                   federalTax
                   Total tax
                   Net income
 */
public class SalaryCalculator_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter his/her hourly rate");
        double hourlyRate = input.nextDouble();

        System.out.println("how many hours he/she works in a week");
        double hoursWeek = input.nextDouble();

        System.out.println("enter state tax (in percentage)");
        double stateTax = input.nextDouble();

        System.out.println("enter federal tax (in percentage)");
        double federalTax = input.nextDouble();

       double salary = hoursWeek * hourlyRate;
        double withStateTax = salary*stateTax/100;
        double withFederalTax = salary*federalTax/100;
        double totalTax = withFederalTax+withStateTax;
       double netIncome = salary-totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("withStateTax = " + withStateTax);
        System.out.println("withStateTax = " + withStateTax);
        System.out.println("netIncome = " + netIncome);

    }
}
