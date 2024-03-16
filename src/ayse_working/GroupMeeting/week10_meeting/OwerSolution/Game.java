package ayse_working.GroupMeeting.week10_meeting.OwerSolution;

public class Game {

    // SOLID principles...
    // S ingle Responsibility
    public static void main(String[] args) {

        Fighter tom = new Fighter("Tom", 10, 2);
        Fighter harry = new Fighter("Harry", 5, 4);

        System.out.println("Winner is : "+ declareWinner(tom, harry, "Tom"));

    }

    public static String declareWinner(Fighter first, Fighter second, String name){

        Fighter starter = first.name.equalsIgnoreCase(name) ? first : second;
        Fighter defender = first.name.equalsIgnoreCase(name) ? second : first;

//        Fighter fighter;
//        if (first.name.equalsIgnoreCase(name)){
//           fighter = first;
//        } else {
//            fighter = second;
//        }
        String winner;
        while (true){
            starter.attack(defender);
            if (defender.health <= 0){
                winner = starter.name;
                break;
            }

            // Just swap attacker and defender
            Fighter temp = starter;
            starter = defender;
            defender = temp;
        }
        return winner;
    }
}