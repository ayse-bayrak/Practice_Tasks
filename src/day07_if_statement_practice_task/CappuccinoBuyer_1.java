package day07_if_statement_practice_task;
/*
1. Create a class called  CappuccinoBuyer.
A variable named Size is given, write a program that
can display the price and calories of cappuccino
	Valid sizes are tall, grande,
and venti and their price & calories are:
tall:
price is $3.69
90 calories

grande:
price is $3.99;
120 calories

venti:
price is $4.29
150 calories

If the size is invalid then the output should be "Invalid Size"

Note: MUST use nested if

 */
public class CappuccinoBuyer_1 {
    public static void main(String[] args) {

        String size = "Grande";

        if(size == "Tall" || size == "Grande"|| size == "Venti"){

            if(size == "Tall") {
                System.out.println("price is $3.69\n" +
                        "90 calories");
            } else if (size == "Grande") {

                System.out.println("price is $3.99;\n" +
                        "120 calories");
            }
                else {
                System.out.println("price is $4.29\n" +
                        "150 calories");
                }

            }

        else {
            System.out.println("Invalid Size");
        }

    }
}
