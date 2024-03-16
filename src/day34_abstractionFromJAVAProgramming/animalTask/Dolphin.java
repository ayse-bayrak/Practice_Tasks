package day34_abstractionFromJAVAProgramming.animalTask;

public class Dolphin extends Animal implements Playable, Swimmable{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin " + getName()+ " is eating dolphin food");
    }

    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }
}
