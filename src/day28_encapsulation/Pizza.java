package day28_encapsulation;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        size= size.toLowerCase();

        if(!(size.equals("small")||size.equals("medium") || size.equals("large"))) {
            System.err.println("The size of the pizza can only be small, medium, or large");
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {

        if (numberOfCheeseTopping <0 ) {
            System.err.println("The number of cheese toppings can not be negative");
          System.exit(1);
        }

        if(size.equals("small") && numberOfCheeseTopping >3) {
            System.err.println("The maximum number of cheese toppings is not greater than 3");
            System.exit(1);
        }

        else if(size.equals("medium") && numberOfCheeseTopping >4) {
            System.err.println("The maximum number of cheese toppings is not greater than 4");
            System.exit(1);
        }
        else if(size.equals("large") && numberOfCheeseTopping >5) {
            System.err.println("The maximum number of cheese toppings is not greater than 5");
            System.exit(1);
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        int maxPepperoniTopping = (size.equals("small"))? 4:(size.equals("medium"))? 5:6;
        String result = "" ;
        switch (size) {

            case "small":
                if (numberOfPepperoniTopping < 0 || numberOfPepperoniTopping > 3) {
                 result = "1";
                }
                break;
            case "medium" :
                if (numberOfPepperoniTopping<0 || numberOfPepperoniTopping >4) {
                    result = "1";
                }
                break;
            case "large" :
                if (numberOfPepperoniTopping<0 || numberOfPepperoniTopping >5) {
                 result = "1";
                }
                break;
        }
        if (result.equals("1")) {
            System.err.println("The maximum number of pepperoni toppings is not greater than " + maxPepperoniTopping);
            System.exit(1);
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){

        double uniqueCost = (size.equals("small")) ? 10 : (size.equals("medium")) ? 12 : 14;
        return uniqueCost + 2*(numberOfCheeseTopping+numberOfPepperoniTopping);

    }// returns the total cost of the pizza

    public String toString() {
        return "Pizza{" +
                "size='" + getSize() + '\'' +
                ", numberOfCheeseTopping=" + getNumberOfCheeseTopping() +
                ", numberOfPepperoniTopping=" + getNumberOfPepperoniTopping() +
                ", calcCost=" + calcCost() +
                '}';
    }
}
/*
4. Create a class named Pizza:
                Private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields.
                        Conditions:
                            The size of the pizza can only be small, medium, or large. case insensitive

                            The number of cheese toppings can not be negative; the maximum number of cheese toppings is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            The number of pepperoni toppings can not be negative; the maximum number of pepperoni toppings is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows the user to set all the fields when the object is created.
                                (If the arguments are not valid, they should not be set to the instances)


                Methods:
                    calcCost(): returns the total cost of the pizza
                    toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */