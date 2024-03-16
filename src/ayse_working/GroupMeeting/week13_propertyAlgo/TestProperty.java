package ayse_working.GroupMeeting.week13_propertyAlgo;

import java.util.*;

public class TestProperty {
    public static void main(String[] args) {
// could be possible to assign object name as a variable or as a key, i tried but i couldn't and at the end i assigned name object's name (attribute) manually as object's name
        Property SquareHouse_1 = new SquareHouse("SquareHouse_1", 20);
        Property SquareHouse_2 = new SquareHouse("SquareHouse_2",25);
        Property SquareHouse_3 = new SquareHouse("SquareHouse_3",30);
        Property SquareHouse_4 = new SquareHouse(3.2);
        System.out.println(SquareHouse_4.getName());

        Property RectangleHouse_1 = new RectangleHouse("RectangleHouse_1",20, 30);
        Property RectangleHouse_2 = new RectangleHouse("RectangleHouse_2",20, 25);

        Property CircleHouse_1 = new CircleHouse("CircleHouse_1", 15);
        Property CircleHouse_2 = new CircleHouse("CircleHouse_2",20);
        Property CircleHouse_3 = new CircleHouse("CircleHouse_3", 10);

        ArrayList<Property> array = new ArrayList<>();
        array.add(SquareHouse_1);
        array.add(SquareHouse_2);
        array.add(SquareHouse_3);
        array.add(RectangleHouse_1);
        array.add(RectangleHouse_2);
        array.add(CircleHouse_1);
        array.add(CircleHouse_2);
        array.add(CircleHouse_3);

        // and except for loop is there any way to print all array object..like this
        // {"SquareHouse_1", 20, }

        array.removeIf(p-> p.calculateSquareMeters()<600);
        System.out.println("==================with removeIf solution=====================");
        System.out.println(array);// to print all features of property which is eligible for customer request

        for (Property property : array) {
            System.out.println(property.getName() + " - " + property.calculateSquareMeters());
        } // to print only name and squareMeters of property which is eligible for customer request

        System.out.println("==================with new ArrayList<>() solution =====================");
        ArrayList<String> result = new ArrayList<>();

        for (Property eachProperty : array) {
            if (eachProperty.calculateSquareMeters()>=600){
                result.add(eachProperty.getName());
            }
        }

        Collections.sort(result);
        System.out.println("Customer request : Houses with area upper 600 square meters are: ");
        System.out.println(result);
        }

    }

    /*
   input :
properties of real estate agent :
 Square Houses
 SquareHouse-1 with 20 m side,
 SquareHouse-2 with 25 m side,
 SquareHouse-3 with 30 m side
 Rectangle Houses
 RectangleHouse-1 with 20 x 30,
 RectangleHouse-2 with 20 x 25
 Circle Houses
 CircleHouse-1 with 15 m radius,
 CircleHouse-2 20 m radius,
 CircleHouse-3 10 m radius
customer request : Houses with area under 600 square meters will not be accepted...
output :
[SquareHouse-2 , SquareHouse-3 , RectangleHouse-1 , CircleHouse-1 , CircleHouse-2 ]

     */
