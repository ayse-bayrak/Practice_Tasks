package day34_abstractionFromJAVAProgramming.animalTask;

public class Parrot extends Animal implements Playable, Flyable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Parrot " + getName()+ " is eating parrot food");
    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {

    }
}
