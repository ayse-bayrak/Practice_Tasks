package day26_static.cydeo_student;

public class CydeoStudent {
    public String name;
    public int age;
    public int id;
    public char gender;
    public int groupNumber, batchNumber;
    public char grade;

    public static String schoolName = "Cydeo School";
    public static String magicWord = "Wooden Spoon";

    public CydeoStudent(String name, int age, int id, char gender, int groupNumber, int batchNumber, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.groupNumber = groupNumber;
        this.batchNumber = batchNumber;
        this.grade = grade;
    }

    public void study(String name) {
        System.out.println(name + " is studying");
    }

    public void attendClass(String name) {
        System.out.println(name + " is attending Class");
    }

    public static void printSchoolName(){
        System.out.println("Scholl name is " + schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("The name of the programming language is " + magicWord);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                ", batchNumber=" + batchNumber +
                ", gender=" + gender +
                '}';
    }


}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of the programming language
					toString()
 */