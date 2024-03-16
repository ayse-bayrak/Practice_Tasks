package day31_inheritanceOverriding.employeeTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println( getJobTitle() + " \" " + getName() + " \" is teaching" );
    }
}
