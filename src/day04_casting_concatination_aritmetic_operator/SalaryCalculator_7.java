package day04_casting_concatination_aritmetic_operator;
/*
Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the following:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560
 */
public class SalaryCalculator_7 {
    public static void main(String[] args) {
        int hourlyRate = 50;
       int weeklyHours = 45;
        int stateTax = 6;  //(given as percentage)
        int federalTax = 26; //(given as percentage)
        int GrossPay=hourlyRate*weeklyHours*52;
        int FederalTaxSum=GrossPay*federalTax/100;
        int StateTaxSum=GrossPay*stateTax/100;
        int TotalTax=FederalTaxSum+StateTaxSum;
        int NetIncome=GrossPay-TotalTax;
        System.out.println("Gross pay is: $"+ GrossPay);
        System.out.println("\tFederal Tax is: $"+ FederalTaxSum);
        System.out.println("\tState tax is: $"+ StateTaxSum);
        System.out.println("\tTotal Tax is: $"+ TotalTax);
        System.out.println("\t Net income is: $"+ NetIncome);

    }
}
