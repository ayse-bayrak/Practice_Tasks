package day31_inheritanceOverriding.studentTask;

public class StudentObjects {
    public static void main(String[] args) {
        Person person = new Person("ayse gunes", 41, 'M');
        System.out.println(person);

        System.out.println("============================================");
        Student student = new Student("ayse", 41, 'F', 35, "business", 'B', "null");
        student.study();
        System.out.println(student);

        System.out.println("============================================");
        GraduateStudent graduateStudent = new GraduateStudent("Betul", 10, 'F', 1, "picture", 'A', "Bayrak");
        graduateStudent.study();
        System.out.println(graduateStudent);

        System.out.println("============================================");
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Akif", 13, 'M', 2, "basketball", 'A', "BAYRAK");
        undergraduateStudent.study();
        System.out.println(undergraduateStudent);

        System.out.println("============================================");
        CydeoStudent cydeoStudent = new CydeoStudent("Mahir", 14, 'M', 3, "BASKETBALL", 'A', "BAYRAK", 2, 10, "java");

        cydeoStudent.eat();
        cydeoStudent.drink();
        cydeoStudent.sleep();
        System.out.println(cydeoStudent);

    }
}
/*
Create a class named StudentObjects:

                        Create the objects of each subclasses

                        test all the functions of each object

                        Analyze the relationships between the classes
 */