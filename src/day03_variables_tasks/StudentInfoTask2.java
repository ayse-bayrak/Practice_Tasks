package day03_variables_tasks;
/*
1. Create a class named StudentInfo.java
2. Declare the following variables with appropriate data types:

1. students_name
2. age
3. gender
4. school_name
5. student_id
6. grade_level
7. gpa
 */
public class StudentInfoTask2 {
    public static void main(String[] args) {

       /* String studentName="Abdullah",
                scholl_Name="Cydeo",
                grade_level="Mid Level JD";
        int num1=100, num2=200, num3=300;
        */

        String student_name="Nora";
        String scholl_name="MIT";
        String grade_level="Undergraduate";
        String student_id="C25";

        int age=26;
        char gender='F';
        double gpa=3.8;
        boolean isFullTime=false;
        System.out.println("\nstudent_name = " + student_name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("student_id = " + student_id);
        System.out.println("grade_level = " + grade_level);
        System.out.println("scholl_name = " + scholl_name);
        System.out.println("gpa = " + gpa);
        System.out.println("isFullTime = " + isFullTime);

    }
}
