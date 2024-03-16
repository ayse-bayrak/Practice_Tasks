package day26_static.restaurant;

import java.time.LocalDate;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        //Make a Restaurant object
        Restaurant r1 = new Restaurant("Ayse Gunes Bayrak", "Boston", 5);
        r1.hireServer(new Server("Ayse", 1234, 75, true, LocalDate.of(2023, 1, 1)));

        Server s1 = new Server("Ayse", 1234, 75, true, LocalDate.of(2023, 1, 1));
        Server s2 = new Server("Akif", 2389, 60, false, LocalDate.of(2023, 1, 1));

        //Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object

        Server[] servers = {s1, s2}; //accepts an array of Server objects and adds all of them to the Servers ArrayList
        r1.hireServer(servers);
        System.out.println(Arrays.toString(servers));

        //OR
        //r1.hireServer(new Server[] {s1, s2});

        r1.terminateServer(1234);

        System.out.println(Arrays.toString(servers));

        System.out.println("=============================================================================");
        System.out.println(r1); //all the information on a Restaurant object


        //Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

        Chef[] chefs = {new Chef("Ziya", 2346, 100, true), new Chef("Ayse", 3456, 120, false)};

        r1.hireChef(chefs[0]);// Chef chef
        r1.hireChef(chefs);// Chef [] chefs

        r1.terminateChef(2346);
        System.out.println(Arrays.toString(chefs));

        //Print your whole restaurant's information

        // Muhtar's test..

        Server[] servers1 = {
                new Server("Yasin", 29, 15, false, LocalDate.of(2022, 10, 18)),
                new Server("Yasin", 29, 15, false, LocalDate.of(2022, 10, 18)),
                new Server("Sabryne", 28, 10, false, LocalDate.of(2022, 10, 18)),
                new Server("Karim", 27, 12, false, LocalDate.of(2022, 10, 18)),
                new Server("Aysel", 26, 20, true, LocalDate.of(2022, 10, 18)),
                new Server("Kamal", 25, 23, true, LocalDate.of(2022, 10, 18)),
        };

        Chef[] chefs1 = {
                new Chef("Halim", 23, 35, true),
                new Chef("Habib", 22, 26, false),
                new Chef("Bojan", 21, 27, true),
        };

        Restaurant restaurant = new Restaurant("Mahdi", "McLean", 4);

        restaurant.hireServer(servers1);
        restaurant.hireChef(chefs1);

        System.out.println(restaurant);



        System.out.println(r1);

    }
}
/*
4.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurant's information
 */