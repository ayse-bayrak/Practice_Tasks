package day04_casting_concatination_aritmetic_operator;
/*
Create a class named GallonsToLiters and declare the following variables:
                gallon
                liters

    4.1 Write a program that can convert any given number of gallons to liters
        Ex:
              gallon = 10

        output:
              10 gallons is equal to 37.9 litters

           Hint:  1 gal = 3.79 L

 */
public class GallonsToLiters_4 {
    public static void main(String[] args) {
        int gallon=10;
        System.out.println(gallon+" gallons is equal to "+(gallon*3.79)+" litters");
    }
}
