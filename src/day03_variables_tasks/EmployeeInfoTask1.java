package day03_variables_tasks;
/*
1. Create a class named EmployeeInfo.java
2. Declare the following variables with appropriate data types:

1. name
2. age
3. gender
4. companyName
5. employeeId
6. jobTitle
7. salary
8. isFullTime
 */
public class EmployeeInfoTask1 {
    public static void main(String[] args) {
        String EmployeeName="Daniel";
        int age=35;
        char gender='M';
        String CompanyName="Google Inc",
                employeeId="A19",
                jobTitle="Java developer";
        int salary=110000;
        boolean isFullTime=true;

        System.out.println(EmployeeName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(employeeId);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(isFullTime);

        System.out.println("---------------");
        System.out.println("EmployeeName = " + EmployeeName);
        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("employeeId = " + employeeId);
        System.out.println("CompanyName = " + CompanyName);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);




    }

}
