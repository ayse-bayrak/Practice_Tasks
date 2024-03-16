package day36_polymorhphism.employeeTask;
//two question in order to decide to should be created as abstract or non-abstract
// 1-is it going to be a parent?
// 2-would you like to create object from this subclasses
public class Teacher extends Employee {
    // I did not make it as abstract, because I want to create an object from it
    // and store the information of the teacher
    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
    @Override
    public void work() {  // 1- to override,
        // it has to be same or more visible other than public what access modifer, only one option, public
        //2- in order to be able to give the body of the method, we don't give this abstract keyword when we override
        // 3-return type, method name and parameters in method overriding, they must be same
        System.out.println(getName() + " is teaching");
    }
}
