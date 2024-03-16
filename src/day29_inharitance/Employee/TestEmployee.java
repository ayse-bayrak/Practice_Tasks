package day29_inharitance.Employee;

public class TestEmployee {
    public static void main(String[] args) {


        Developer developer = new Developer();
        developer.setInfo("Ayse",'F', 41, 2, "Java Developer", 100000 );
        System.out.println(developer);
        developer.coding();

        Tester tester = new Tester();
        tester.setInfo("Betul", 'F', 19, 3, "Tester", 90000 );
        System.out.println(tester);
        tester.testing();

        Teacher teacher = new Teacher();
        teacher.setInfo("Ziya", 'M', 42, 4, "Teacher", 60000 );
        System.out.println(teacher);


        Driver driver = new Driver();
        driver.setInfo("Akif", 'M', 19, 5, "Driver", 75000);
        System.out.println(driver);



    }
}
