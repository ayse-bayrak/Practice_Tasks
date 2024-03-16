package ayse_working.GroupMeeting.week10_meeting.TwoFightersOneWinner;

public class Fighter {
    public String name;
    public int health;
    public int damagePerAttack;

    //Each fighter will be a custom Fighter object/instance (which contains
    //name, health, damagePerAttack and also setInfo method)

    public void setInfo(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    /*Create a function (method) that takes two objects of Fighter and the
    first attacker fighter’s name and returns the name of the winner in a
    fight between two fighters.*/

    public String declareWinner(Fighter fighter1, Fighter fighter2) {
        //Both health and damagePerAttack will be integers and larger than 0.
        if (fighter1.damagePerAttack > 0 && fighter2.damagePerAttack > 0 && fighter1.health > 0 && fighter2.health > 0) {

            while (fighter1.health > 0 && fighter2.health > 0) {
                /*Each fighter takes turns attacking the other and whoever takes the
                life of the other first is victorious. Victory is defined as decreasing
                opponent’s health <= 0.*/
                System.out.println(fighter1.name + " attacks " + fighter2.name);
                fighter2.health -= fighter1.damagePerAttack;
                System.out.println(fighter2.name + " now has " + fighter2.health + ".");

                if (fighter1.health > 0 && fighter2.health > 0) {

                    System.out.println(fighter2.name + " attacks " + fighter1.name);
                    fighter1.health -= fighter2.damagePerAttack;
                    System.out.println(fighter1.name + " now has " + fighter1.health + ".");

                } else {
                    break;
                }
            }

        } else {
            System.err.println("Invalid health or damagePerAttack");
            System.exit(1);
        }

        if (fighter1.health > fighter2.health) {
            return fighter1.name;
        } else {
            return fighter2.name;
        }

    }


}
/*
Question-1 Two Fighters, One Winner
Create a function (method) that takes two objects of Fighter and the
first attacker fighter’s name and returns the name of the winner in a
fight between two fighters.

Each fighter takes turns attacking the other and whoever takes the
life of the other first is victorious. Victory is defined as decreasing
opponent’s health <= 0.

Each fighter will be a custom Fighter object/instance (which contains
name, health, damagePerAttack and also setInfo method).

Both health and damagePerAttack will be integers and larger than 0.
Example 1:
 input :
 Fighter tom = new Fighter(); tom.setInfo("Tom", 10, 2);
 Fighter harry = new Fighter(); harry.setInfo("Harry", 5, 4);
 declareWinner(tom, harry, "Tom")
 output : "Tom wins"
 Explanation :
 Tom attacks Harry; Harry now has 3 health.
 Harry attacks Tom; Tom now has 6 health.
 Tom attacks Harry; Harry now has 1 health.
 Harry attacks Tom; Tom now has 2 health.
 Tom attacks Harry: Harry now has -1 health and is dead. Tom wins.
Example 2:
Fighter jerry = new Fighter(); jerry.setInfo("Jerry", 30, 3);
Fighter harald = new Fighter(); harald.setInfo("Harald", 20, 5);
declareWinner(jerry, harald, "Jerry") => Harald wins
 */