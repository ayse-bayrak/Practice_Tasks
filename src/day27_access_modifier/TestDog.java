package day27_access_modifier;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Gumus", " Medium","Small", 'F', 4, "White");

        dog1.eat();
        dog1.drink();
        dog1.play();
        dog1.slepp();
        dog1.bark();

        System.out.println(dog1);


    }
}
