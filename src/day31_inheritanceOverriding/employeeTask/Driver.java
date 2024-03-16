package day31_inheritanceOverriding.employeeTask;

public class Driver extends Employee{
    public Driver(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    public void work() {
        System.out.println( getJobTitle() + " \" " + getName() + " \" is driving" );
    }
}
