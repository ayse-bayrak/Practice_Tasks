package day31_inheritanceOverriding.studentTask;

import java.util.Arrays;
//Create a subclass of Person named Student:
public class Student extends Person{
    private int studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }
/*
Condition:
 1. filedOfStudy and schoolName should not be set to null
 2. filedOfStudy and schoolName should not be empty
 3. grade must be valid (A, B, C, D, F)
 */

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy== null || fieldOfStudy.isEmpty()) {
            System.out.println(fieldOfStudy + " invalid data, filedOfStudy should not be set to null or empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        Character[] grade1 = {'A', 'B', 'C', 'D', 'F'};
        if (Arrays.asList(grade1).contains(grade)) {
            this.grade = grade;
        }else{
            System.err.println(grade + " invalid data, grade must be valid (A, B, C, D, F) ");
            System.exit(1);
        }
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {

        if (schoolName == null){
            System.err.println(schoolName + "invalid data, schoolName should not be set to null");
            System.exit(1);
        }
        if (schoolName.isEmpty()||schoolName.isBlank()) {
            System.err.println(schoolName + "invalid data, schoolName should not be set to empty or blank");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }
    public void study() {
        System.out.println(getName()+" is studying");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
Create a subclass of Person named Student:
                Extra variables:
                        studentId, fieldOfStudy, grade, schoolName

                Encapsulate all the fields

                Add a constructor that can set all the fields

                            Condition:
                                    1. filedOfStudy and schoolName should not be set to null
                                    2. filedOfStudy and schoolName should not be empty
                                    3. grade must be valid (A, B, C, D, F)


                Extra methods:
                    study()
                    toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included

 */