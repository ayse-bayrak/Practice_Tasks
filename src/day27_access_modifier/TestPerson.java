package day27_access_modifier;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Ayse",41, 'F', "Turkish");

        Person.printPlanetName();

        p1.eat("choclade");
        p1.drink("milk");

        System.out.println(p1);
    }
}
