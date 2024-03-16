package day28_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();
        Candy candy1 = new Candy("Ulker", 4, 0,true);
        Candy candy2 = new Candy("Eti", 2, 2,true);
        Candy candy3 = new Candy("Godiva", 3, 4.1,true);
        Candy candy4 = new Candy("Milka", 1, 3.1,true);
        Candy candy5 = new Candy("Nestle", 5, 2.1,true);

        candies.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));


        for (Candy each : candies) {
            System.out.println("===================");
            System.out.println("Brand Candy: " + each.getBrand());
            System.out.println("Price of Candy: " + each.getPrice());
        }

        System.out.println(candies);



    }
}
/*
Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                Use a for each loop to print the brand and price of each candy
 */