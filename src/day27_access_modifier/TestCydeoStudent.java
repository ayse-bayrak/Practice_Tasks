package day27_access_modifier;

public class TestCydeoStudent {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Ayse",41,'F',12344, 2, 10, 'A' );

        // static method can be called through class name
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();

        // instance method can be called through object
        student1.attendClass();
        student1.study();
        student1.toString();

        CydeoStudent student11 = new CydeoStudent("Jimmy", 39, 'M', 14, 25, 16, 'C');

        CydeoStudent student2 = new CydeoStudent("Kathy", 29, 'F', 15, 25, 13, 'A');

        System.out.println(student11);

        System.out.println(student2);

        student11.printSchoolName();
        student2.printSchoolName();

        student11.printProgLanguage();
        student2.printProgLanguage();

    }
}
