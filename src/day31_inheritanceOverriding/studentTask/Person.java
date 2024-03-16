package day31_inheritanceOverriding.studentTask;

import java.util.Arrays;

public class Person {

    private String name;
    private int age;
    private char gender;

  //Add a constructor that can set all the fields
    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    //Encapsulate all the fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name== null || name.isEmpty())
        {
            System.err.println(name + ": invalid data.\nThe name should not be set to null or empty");
            System.exit(1);
        }

        for (int i = 0; i < name.length(); i++) {

            if(!Character.isLetterOrDigit(name.charAt(i)) && !(name.charAt(i)+ "").equals(" ")) {
                System.err.println("The name should not contain any special character other than space");
                System.exit(1);
            }
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 ) {
            System.err.println("Age should not be set to negative");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender=='M'||gender == 'F') {
            this.gender = gender;
        }else {
            System.err.println(gender + ": invalid gender. Gender must be valid");
            System.exit(1);
        }
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor that can set all the fields

                    Condition:
                        1. The name should not be set to null
                        2. The name should not be empty
                        3. The name should not contain any special character other than space
                        4. age should not be set to negative
                        5. gender must be valid

            Methods:
                eat()
                drink()
                sleep()
                toString()
 */