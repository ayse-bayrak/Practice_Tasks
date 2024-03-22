package ayse_working.GroupMeeting.part1Questions;

import java.util.Scanner;

public class Question_1_AnimalFast {
    public static void main(String[] args) {

        animalFeast();

    }

    public static boolean animalFeast() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a animal name");
        String animal = input.nextLine();
        System.out.println("Enter a dish name");
        String dish = input.nextLine();

        boolean result = false;
        char firstAnimal = animal.charAt(0);
        char lastAnimal = animal.charAt(animal.length()-1);

        char firstDish = dish.charAt(0);
        char lastDish = dish.charAt(dish.length()-1);

        if( (firstAnimal == firstDish) && (lastAnimal == lastDish )) {
            result = true;
        }

        System.out.println(result);
        return result;
    }
}
/*
great blue heron ==== garlic naan
chickadee === chocolate cake
 */