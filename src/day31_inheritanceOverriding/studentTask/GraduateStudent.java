package day31_inheritanceOverriding.studentTask;

public class GraduateStudent extends Student{
    public GraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName() + " studies as a graduate student");
    }
}
/*
1. GraduateStudent:

                        Override the study method

                        add any additional fields and methods if necessary
 */