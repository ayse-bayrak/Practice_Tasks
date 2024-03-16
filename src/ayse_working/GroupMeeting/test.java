package ayse_working.GroupMeeting;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a animal name");
        String animal = input.next();
        System.out.println("Enter a fish name");
        String dish = input.next();

        boolean result = false;
        char firstAnimal = animal.charAt(0);
        char lastAnimal = animal.charAt(animal.length()-1);

        char firstDish = dish.charAt(0);
        char lastDish = dish.charAt(dish.length()-1);

        if(firstAnimal==firstDish && lastAnimal==lastDish) {
            result = true;
        }
        System.out.println(result);
    }
}
