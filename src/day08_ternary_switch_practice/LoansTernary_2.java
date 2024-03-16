package day08_ternary_switch_practice;
/*
2. Create a class called Loans; given two variables, salary and credit score, use the given info to determine if you can get a loan.

                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.

 */
public class LoansTernary_2 {
    public static void main(String[] args) {
        int salary=60000, creditScore= 650;
        String loanResult="";
        loanResult=(salary>=60000&&creditScore>=650)?"Loan Approved":"Loan Denied";

        System.out.println(loanResult);
    }
}
