package ayse_working.GroupMeeting.week12.execetionOrder;

public class Animal {

    {
        System.out.println("Animal Initialization block");
    }

    static {
        System.out.println("Animal static block");
    }

    public Animal(){
        System.out.println("Constructor of Animal");
    }
}

class Dog extends Animal {

    {
        System.out.println("Animal Initialization block");
    }

    static {
        System.out.println("Dog static block");
    }

    public Dog() {
        System.out.println("Constructor of Dog");
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

    }

}

/*
---Ordering the executed---
1-Static block (all static block of code are executed before the other execution)
2-Instance block (first parent initialization block gets executed, and then parent constructor gets executed)
3-Constructor

For example in here, output is:
-Animal static block
-Dog static block
-Animal Initialization block
-Constructor of Animal
-Animal Initialization block
-Constructor of Dog
 */