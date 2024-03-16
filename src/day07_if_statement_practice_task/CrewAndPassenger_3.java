package day07_if_statement_practice_task;
/*
3. Create a class called CrewAndPassenger; given the number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
public class CrewAndPassenger_3 {
    public static void main(String[] args) {
        int total = 100;
        String result = "";

        if(total == 50 || total == 75 ||total == 100 ) {
            if (total == 50 ) result = "20 crew, 30 passengers";
            else if (total == 75 ) result = "25 crew, 50 passengers";
            else result = "30 crew, 70 passengers";
        }
        else {
            result = "is not valid ";
        }
        System.out.println(result);
    }
}
