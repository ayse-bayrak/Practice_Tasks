package day07_if_statement_practice_task;
/*
7. Create a class called GradeLevel; given a number(byte) grade level, determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */
public class GradeLevel_7 {
    public static void main(String[] args) {
        int n= 18;
        String result = "";
        if (n >= 1 && n <= 18) {
          if (n<=5) result ="Elementary School";
          else if (n<=8) result ="Middle School";
          else if (n<=12) result ="High School";
          else if (n<=16) result ="Collage";
          else result = "Grad Scholl";

        }
        else {
            result ="invalid grade level given";
        }
        System.out.println(result);
    }
}
