package day07_if_statement_practice_task;
/*

5. Create a class called AgeGroups, and write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if the age is negative or greater than 150, print "invalid"

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
public class AgeGroups_5 {
    public static void main(String[] args) {
        int age = 3;
        String result = "";

        if (age>0 && age <=150 ) {

            if (age<21) result = "Teenager";
            else if (age <55) result = " Adult";
            else result = "Senior";
        }
        else {
            result ="invalid";
        }
        System.out.println(result);
    }
}
