package day36_polymorhphism;

import day34_abstractionFromJAVAProgramming.carTask.Audi;
import day34_abstractionFromJAVAProgramming.carTask.Car;
import day34_abstractionFromJAVAProgramming.carTask.Honda;
import day34_abstractionFromJAVAProgramming.carTask.Tesla;

import java.util.ArrayList;

public class CarObject {
    public static void main(String[] args) {
                Car[] cars = {
                new Honda("Pilot", "White", 2010, 25000),
                new Audi("Q6", "Red", 2014, 32000),
                new Honda("Accord", "White", 2011, 30000),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black", 2019, 35000),
                new Audi("Q8", "White", 2018, 40000),
                new Audi("Q5", "Purple", 2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red", 2018, 20000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue", 2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue", 2014, 48000),
        };
        //1.2 Write a program that can display all the cars that are eligible for recall
        for (day34_abstractionFromJAVAProgramming.carTask.Car each : cars) {
            if (!(each instanceof Car)) {
                System.err.println("Invalid Obj");
                System.exit(1);
            }

            if (each.getMake().equals("Honda")) {
                if (each.getYear() == 2010 || each.getYear() == 2011) {
                    System.out.println(each.getMake() + " " + each.getModel() + " is eligible to recall");
                }
            } else if (each.getMake().equals("Audi")) {
                if (each.getYear() >= 2015 && each.getYear() <= 2019) {
                    System.out.println(each.getMake() + " " + each.getModel() + " is eligible to recall");
                }
            } else {
                System.out.println(each.getMake() + " " + each.getModel() + " is eligible to recall");
            }
        }
        System.out.println("=================================================");
        //1.3 Write a program that can display the car that has the highest price
        double highest = cars[0].getPrice();
        double lowest = cars[0].getPrice();

        System.out.println(highest);
        System.out.println(lowest);

        for (Car each : cars) {
            if(each.getPrice() > highest) {
                highest = each.getPrice();
            }

            if(each.getPrice() < lowest) {
                lowest = each.getPrice();
            }
        }

        for (Car each : cars) {
            if(each.getPrice() == highest) {
                System.out.println(each.getMake()+ "-" + each.getModel() + " the highest price");
            }

            if(each.getPrice() == lowest) {
                System.out.println(each.getMake()+ "-" + each.getModel() + " the lowest price");
            }
        }

        System.out.println("=================================================");
        //Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
        //ArrayList<Tesla> teslaCars = new ArrayList<>()

        ArrayList<Tesla> teslaCars = new ArrayList<>();

        for (Car each : cars) {
            if (each.getMake().equals("Tesla")) {
                teslaCars.add((Tesla)each);
            }
        }

        System.out.println(teslaCars);
    }

}

/*
1 Given the following array that contains the car objects:
				 Car[] cars = {
                new Honda("Pilot","White", 2010, 25000),
                new Audi("Q6", "Red",2014, 32000),
                new Honda("Accord", "White",2011, 20000  ),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black",2019, 35000),
                new Audi("Q8", "White",2018, 40000),
                new Audi("Q5", "Purple",2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red",2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue",2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue",2014, 48000),
        };

		        (import them from day34 package)


	        1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
	        							Audi: from year 2015 to 2019
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest price

			1.3 Write a program that can display the car that has the lowest price

			1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
						ArrayList<Tesla> teslaCars = new ArrayList<>()
 */