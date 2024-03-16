package day31_inheritanceOverriding.employeeTask;

public class TestEmployeeObject {
    public static void main(String[] args) {
        Tester tester = new Tester("Hatice", 33, 'F', 3, "Tester", 100000, "FinByte");
        tester.work();
        System.out.println(tester);

        Developer developer = new Developer("Ayse", 41, 'M', 4, "Developer", 110000, "Google", "Java");
        developer.work();
        System.out.println(developer);

        Teacher teacher = new Teacher("Emine", 38, 'M', 7,"Teacher", 80000, "Ilkokul");
        teacher.work();
        System.out.println(teacher);

        Driver driver = new Driver("Sukru", 40, 'M', 9, "Driver", 70000, "Kamyon");
        driver.work();
        System.out.println(driver);
    }
}
