package day19_array_intro;

import java.util.Arrays;

public class Items_3 {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};

        System.out.println(Arrays.toString(items));
        System.out.println("=========");
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        for (int i = 0; i < items.length; i++) {

            if (items[i].contains("Gloves")) {
                System.out.println("1. The first index number of \"Gloves\" is " + i);
                System.out.println("1. The first index number of \"Gloves\" is " + items[i].charAt(0));
            }

            if (items[i].contains("iPad")) {
                System.out.println("2. \"iPad\" is contained in the item list");
            }
        }

        System.out.println("3. Shopping Item: ");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + prices[i] + " - #" + itemIDs[i]);
        }
    }
}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0,    439.50,  39.99};
        int[] itemIDs =   {12345,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */