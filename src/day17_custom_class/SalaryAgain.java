package day17_custom_class;

public class SalaryAgain {
    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryAgain(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate / 100;// to make sure that user does not need to convert the percentage to decimal
        this.federalTaxRate = federalTaxRate / 100;// to make sure that user does not need to convert the percentage to decimal
        this.weeklyHours = weeklyHours;
    }

    public double salary() {
        return weeklyHours * hourlyRate * 52;
    }

    public double stateTax() {
        return salary() * stateTaxRate;
    }

    public double federalTax() {
        return salary() * federalTaxRate;
    }
    public double salaryAfterTax() {

        return salary()-stateTax()-federalTax();
    }

    public String toString() {
        return "SalaryAgain{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", salary= $" + salary() +
                ", state tax= $" + stateTax() +
                ", federal tax= $" + federalTax() +
                ", salary after tax= $" + salaryAfterTax() +
                '}';
    }
}
/*
Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state Tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should display the salary, stateTax, federalTax, salaryAfterTax of the Object
 */