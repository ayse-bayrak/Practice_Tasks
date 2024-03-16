package day15_loops_continue;

import java.util.Scanner;

public class RoomReservation_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPrice = 0;
        double kingPrice = 120;
        double queenPrice = 100;
        double singlePrice = 80;

        System.out.println("Do you want to reserve a room? Yes/No");
        String answer = input.next().toLowerCase();


        while ( !(answer.equals("yes") || answer.equals("no"))  ) {
            System.out.println("Invalid answer, please re-enter a valid entry");
            answer = input.next().toLowerCase();
        }

        if (answer.equals("yes")){

            while(true) {

                System.out.println("Which type of room do you want to reserve? King / Queen / Single ");
                System.out.println("\tKing Bed ==> 120$\n" +
                        "\tQueen Bed ==> 100$\n" +
                        "\tSingle Bed ==> 80$");
                String roomType = input.next().toLowerCase();

                while (!(roomType.equals("king") || roomType.equals("queen") || roomType.equals("single"))) {
                    System.out.println("You selected an invalid room, please re-enter a valid room");
                    roomType = input.next().toLowerCase();
                }

                switch (roomType) {
                    case "king":
                        totalPrice += kingPrice;
                        break;
                    case "queen":
                        totalPrice += queenPrice;
                        break;
                    case "single":
                        totalPrice += singlePrice;
                        break;
                }

                //System.out.println("You selected " + (roomType.charAt(0)+"").toUpperCase() + roomType.substring(1) + " Bed room" );
                System.out.println("The total price of the room: $" + totalPrice);

                System.out.println("Would you like to reserve another room ? Yes/No");
                answer = input.next().toLowerCase();
                if (answer.equals("no")) {
                    System.out.println("Have a nice day");
                    break;
                }
            }
        } else {
            System.out.println("Have a nice day");
        }
input.close();
    }
}
/*

Muhtar added new requirement .. ask would you like to reserve another room? and go on until say no


8. Create a class called RoomReservation, and write a program for the room reservation;
your program asks the user if they want to reserve a room.
if the user enters yes, then ask which type of room the user wants to reserve.
if the user entered no, print "Have a nice day"
(if the user entered any invalid answer (other than yes/no)
ask the user to reenter until the user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

the program should be able to display the room he/she reserved and the total price of the room.

 (if the user selected an invalid room, ask the user to reselect the room until the user provides a valid entry)


 */