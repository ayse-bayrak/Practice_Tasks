package day21_multidimensional_array;

public class Items_Task2 {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        //1 use for

        for (String[] item1 : items) {
            for (String eachItem : item1) {
                System.out.print(eachItem+ "\t");
            }
            System.out.println();
        }

        //2 use forr

        for (String[] item1 : items) {
            for (int i = item1.length - 1; i >= 0; i--) {
                System.out.print(item1[i]+ "\t");
            }
            System.out.println();
        }

        //3 use fori

        for (int i = items.length - 1; i >= 0; i--) {

            for (String eachItem : items[i]) {

                System.out.print(eachItem+ "\t");
            }
            System.out.println();
        }

    }
}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Paper   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Paper   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */