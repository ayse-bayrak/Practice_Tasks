package day17_custom_class;

public class TestSalaryCalculatorObject {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator();

        salary1.setInfo(1000, 20, 10, 40);

        salary1.salary();
        salary1.stateTax();
        salary1.federalTax();
        salary1.salaryAfterTax();

        System.out.println(salary1);
    }
}
