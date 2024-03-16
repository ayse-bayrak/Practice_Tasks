package ayse_working.selfGroupMeeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shopping {
    public static void main(String[] args) {
        List<String> shoppingCart = new ArrayList<>();
        shoppingCart.addAll(Arrays.asList("brokoli", "oranges", "strawberries", "Carrot", "Tomato"));

        shoppingCheck(shoppingCart);
        double result = totalPrice(shoppingCart);
        System.out.println(result);
    }

    public static void shoppingCheck(List<String> shoppingCart) {

        List<String> vegetables = new ArrayList<>();
        vegetables.addAll(Arrays.asList("brokoli", "carrots", "artichokes", "eggplants" ));
        List<String> fruits = new ArrayList<>();
        fruits.addAll(Arrays.asList("apples", "oranges", "strawberries", "bananas", "peaches"));

        shoppingCart.removeIf(p-> !vegetables.contains(p)&& !fruits.contains(p));
    }

    public static double totalPrice (List<String> shoppingCart) {
        //price
        double spinachPrice = 3;
        double broccoliPrice=  4;
        double totalPrice = 0;
        // because the shopping is done in winter, must be winter vegetables or fruits,
        List<String> winterVegetables = new ArrayList<>();
        winterVegetables.addAll(Arrays.asList("spinach", "broccoli", "cauliflower", "celery"));
        List<String> winterFruits = new ArrayList<>();
        winterFruits.addAll(Arrays.asList("quince", "orange", "tangerine"));

        for (String eachItem : shoppingCart) {
                boolean winterVegaOrFruits = false;
            if (winterVegetables.contains(eachItem)||winterFruits.contains(eachItem)) {
                winterVegaOrFruits= true;
            }
            switch (eachItem) {
                case "spanish":
                    totalPrice += spinachPrice;
                    if (winterVegaOrFruits){
                        totalPrice *=0.2;
                    }
                    break;

                case "broccoli":
                    totalPrice += broccoliPrice;
                    if (winterVegaOrFruits){
                        totalPrice *=0.2;
                    }
                    break;
                    // you can go on for the other situation..
            }
        }
        return totalPrice;
        // tax for non-seasonal
    }
}
/*
Example :
-Shopping-

A mother and her child go to the market on January 15th. The child takes the shopping cart and randomly chooses some products and puts them in the cart.

Part 1:

-Before going to the checkout for payment, the mother needs to check the items in the shopping cart and eliminate the items that are not on the list.
She will use an electronic device for this and you need to write a program for this device.

The program's elimination and control criteria are as follows:


From vegetables, it can only take the following:
                                      broccoli, carrots, artichokes, eggplants,


From fruit you can only take the following:
                                      apples, oranges, strawberries, bananas, peaches

Part 2:

Price calculation: The price of the products will be calculated at the end of the shopping. A separate program should be written for the calculation:
-for non-seasonal vegetables, an extra fee of 20% of the total amount of the product will be charged as greenhouse production tax.
-for non-seasonal fruits, an extra fee of 20% of the total amount of the product will be charged as greenhouse production tax.


-prices of the products:

Spinach 3 dollars
Broccoli: 4 dollars
Celery: 2 dollars
Eggplant: 5 dollars
Carrot 1 dollar
Artichoke: 15 dollars
Okra: 9 dollars
Apple 3 dollars
Oranges: 4 dollars
Strawberry 7 dollars
Banana 5 dollars
Peaches: 9 dollars
Tangerines: 8 dollars
Melon: 10 dollars
Quince: 6 dollars

Winter vegetables: spinach, broccoli, cauliflower, celery
Winter fruits: quince, orange, tangerine
Summer vegetables: artichokes, okra
Summer fruits: peaches, strawberries, melons

 */