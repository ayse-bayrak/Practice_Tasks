package day16_nested_loop;

import java.util.Scanner;

public class RoomReservation_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       while (true) {

           System.out.println("Which bedroom do you want to reserve? King/Queen/Single");
           System.out.println("\tKing Bed ==> 120$\n" +
                   "\tQueen Bed ==> 100$\n" +
                   "\tSingle Bed ==> 80$");
           String roomType = input.next().toLowerCase();

           while (!(  roomType.equals("king")|| roomType.equals("queen")||roomType.equals("single") )  ) {
               System.err.println("Invalid entry, please re-enter valid entry");
               roomType = input.next().toLowerCase();
           } // to make sure user selected either the king bed, or queen bed or single bed

           double price = (roomType.equals("king")?120:roomType.equals("queen")?100:80 );

           System.out.println("How many nights are you staying?");
           int night = input.nextInt();

           while ( !(night > 0) ) {
               System.err.println("Invalid entry, please re-enter valid entry");
               night = input.nextInt();
           }

           System.out.println("Would you like to reserve another room? Yes/No");
           String answer = input.next().toLowerCase();

           while ( !(  answer.equals("yes") || answer.equals("no")  )   ) {
               System.err.println("Invalid entry, please re-enter valid entry");
               System.out.println("Would you like to reserve another room? Yes/No");
               answer = input.next().toLowerCase();
           }// it stops if the answer is either ye or no

           if (answer.equals("no")) {
               System.out.println("Your total price is $" + (price*night));
               break;
           }

       }
    input.close();
    }
}
/*
8. Create a class called RoomReservation, and write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom he/she wants to reserve and how many nights he/she is staying.
            Then Ask the user "Would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

                If the user enters any invalid entry,  ask the user to re-enter until the user provides a valid entry
 */