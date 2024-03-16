package day26_static.cydeo_student;

public class TestCydeoStudent {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Ayse",41,234063,'F',2, 10, 'A');
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();
        student1.study(student1.name);
        student1.attendClass(student1.name);

        System.out.println(student1);


    }
}
