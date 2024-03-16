package day09_scanner_class;
/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If the user enters an invalid score (negative or more than 100) print "Invalid Score"
 */
import java.util.Scanner;

public class GradeReport_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your score: ");
        int score = input.nextInt();
        char grade='A';
        if (score>0 && score <=100){
            if (score <=60) {
                grade ='F';
            } else if (score<=70) {
                grade ='D';
            }else if (score<=80) {
                grade ='C';
            }else if (score<=90) {
                grade ='B';
            }else if (score<=100) {
                grade ='D';
            }else {
                grade  ='A';
            }
            System.out.println(grade);
        }else {
        System.out.println("Invalid Score");}
    }
}
