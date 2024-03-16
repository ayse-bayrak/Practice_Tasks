package day42_maps;

import java.util.*;

public class JavaTopics_5 {
    public static void main(String[] args) {
        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 4.0);
        unit1.put("Escape Sequences", 2.0);
        unit1.put("Primitives", 4.0);
        unit1.put("Operators", 6.0);
        unit1.put("If Statements", 9.0);
        unit1.put("Switch Statement", 4.0);
        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("String Manipulation", 12.0);
        unit2.put("Loops", 17.5);
        unit2.put("Branching Statements", 1.5);
        unit2.put("Arrays", 14.5);
        unit2.put("Custom Methods", 16.5);
        unit2.put("Wrapper Classes", 3.0);
        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Methods", 16.5);
        unit3.put("Wrapper Classes", 3.0);
        unit3.put("ArrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("Custom Class", 23.5);
        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("OOP Encapsulation", 4.5);
        unit5.put("OOP Inheritance", 13.5);
        unit5.put("Final keyword", 2.5);
        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 9.5);
        unit6.put("OOP Polymorphism", 7.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);

        //5.1 Create a List and store all the map objects given in above
        System.out.println("==============================================");
        List<Map<String, Double>> javaTopics = new ArrayList<>();

        javaTopics.add(unit1);
        javaTopics.add(unit2);
        javaTopics.add(unit3);
        javaTopics.add(unit4);
        javaTopics.add(unit5);
        javaTopics.add(unit6);


        //5.2 Display each Java topic and its hours on the console
        System.out.println("==============================================");

        for (Map<String, Double> eachJavaTopic : javaTopics) {
            for (Map.Entry<String, Double> eachUnit : eachJavaTopic.entrySet()) {
                System.out.println(eachUnit);
            }
        }

        //5.3 Display the names of the java topics that we spend more than 7 hours
        System.out.println("==============================================");
        for (Map<String, Double> eachJavaTopic : javaTopics) {
            for (Map.Entry<String, Double> eachUnit : eachJavaTopic.entrySet()) {
                if (eachUnit.getValue()>7) {
                    System.out.println(eachUnit.getKey());
                }
            }
        }

       // 5.4 Display the names of the java topics that we spend less than 3 hours
        System.out.println("==============================================");

        for (Map<String, Double> eachJavaTopic : javaTopics) {
            for (Map.Entry<String, Double> eachUnit : eachJavaTopic.entrySet()) {
                if (eachUnit.getValue()<3) {
                    System.out.println(eachUnit.getKey());
                }
            }
        }

        //     5.5 Which Java Topic has the maximum hours?
        System.out.println("==============================================");

        double maxHours = 0;
        for (Map<String, Double> map : javaTopics) {
            for (Map.Entry<String, Double> eachEntry : map.entrySet()) {
                if (eachEntry.getValue()>= maxHours) {
                    maxHours = eachEntry.getValue();
                }
            }
        }

        for (Map<String, Double> eachUnit : javaTopics) {
            for (Map.Entry<String, Double> eachEntry : eachUnit.entrySet()) {
               if( eachEntry.getValue().equals(maxHours) ){
                   System.out.println("Java Topic " + eachEntry.getKey() + " have max hours: " + eachEntry.getValue());
               }
            }

        }

        //  5.6 Which topic has the minimum hours?
        System.out.println("=============================================");
        double minHours = 10000;
        for (Map<String, Double> map : javaTopics) {
            for (Map.Entry<String, Double> eachEntry : map.entrySet()) {
                if (eachEntry.getValue()<= minHours) {
                    minHours = eachEntry.getValue();
                }
            }
        }

        for (Map<String, Double> eachUnit : javaTopics) {
            for (Map.Entry<String, Double> eachEntry : eachUnit.entrySet()) {
                if( eachEntry.getValue().equals(minHours) ){
                    System.out.println("Java Topic " + eachEntry.getKey() + " have min hours: " + eachEntry.getValue());
                }
            }

        }


    }
}
/*
5. 	Given the following maps that contains the Java topics of each unit and the amount of hours that we spend on it:
		Map<String, Double> unit1 = new LinkedHashMap<>();
	        unit1.put("Print Statements", 4.0);
	        unit1.put("Escape Sequences", 2.0);
	        unit1.put("Primitives", 4.0);
	        unit1.put("Operators", 6.0);
	        unit1.put("If Statements", 9.0);
	        unit1.put("Switch Statement", 4.0);
	        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
	        unit2.put("String Manipulation", 12.0);
	        unit2.put("Loops", 17.5);
	        unit2.put("Branching Statements", 1.5);
	        unit2.put("Arrays", 14.5);
	        unit2.put("Custom Methods", 16.5);
	        unit2.put("Wrapper Classes", 3.0);
	        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
	        unit3.put("Custom Methods", 16.5);
	        unit3.put("Wrapper Classes", 3.0);
	        unit3.put("ArrayList", 11.5);

	        Map<String, Double> unit4 = new LinkedHashMap<>();
	        unit4.put("Custom Class", 23.5);
	        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
	        unit5.put("OOP Encapsulation", 4.5);
	        unit5.put("OOP Inheritance", 13.5);
	        unit5.put("Final keyword", 2.5);
	        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
	        unit6.put("OOP Abstraction", 9.5);
	        unit6.put("OOP Polymorphism", 7.5);
	        unit6.put("Collection", 9.5);
	        unit6.put("Map", 7.5);


        5.1 Create a List and store all the map objects given in above

        5.2 Display each Java topic and its hours on the console

        5.3 Display the names of the java topics that we spend more than 7 hours

        5.4 Display the names of the java topics that we spend less than 3 hours

        5.5 Which Java Topic has the maximum hours?

        5.6 Which topic has the minimum hours?

 */