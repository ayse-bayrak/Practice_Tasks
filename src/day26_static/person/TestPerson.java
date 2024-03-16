package day26_static.person;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Ayse", 41, 'F');
        Person person2 = new Person("Breanna", 32, 'F');

        System.out.println(person1);
        person1.eat("Chocolate");
        person1.drink("Milk");
        person1.sleep();


        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);


        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);


    }
}
