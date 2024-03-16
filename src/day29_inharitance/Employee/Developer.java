package day29_inharitance.Employee;

import java.util.Arrays;

public class Developer extends Employee{
private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // method overloading
    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary, String programmingLanguage){
        setInfo(name,gender, age, id, jobTitle, salary);
    String[] language = {"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"};

    if (Arrays.asList(language).contains(programmingLanguage)) {
            this.programmingLanguage = programmingLanguage;
        }else {
            System.err.println("programming language can only be set to one of the followings:\n" +
                    "{\"Java\", \"JavaScript\", \"Python\", \"Ruby\", \"C#\", \"C++\", \"Swift\"}");
            System.exit(1);
        }

    }

    public void coding() {
        System.out.println(getName() + " is coding" + getProgrammingLanguage());
    }
}
