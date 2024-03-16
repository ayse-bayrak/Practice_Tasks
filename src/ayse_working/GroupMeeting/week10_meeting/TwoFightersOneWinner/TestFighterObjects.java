package ayse_working.GroupMeeting.week10_meeting.TwoFightersOneWinner;

public class TestFighterObjects {
    public static void main(String[] args) {// application main class

        Fighter fight = new Fighter();

        Fighter fighter1 = new Fighter();
        fighter1.setInfo("Tom", 10, 2);
        Fighter fighter2 = new Fighter();
        fighter2.setInfo("Harry", 5, 4);

        String winner1 = fight.declareWinner(fighter1, fighter2);
        System.out.println("winner is " + winner1);

        System.out.println("=======================================================================");

        Fighter fighter3 = new Fighter();
        fighter3.setInfo("Jerry", 30, 3);
        Fighter fighter4 = new Fighter();
        fighter4.setInfo("Harald", 20, 5);

        String winner2 = fight.declareWinner(fighter3, fighter4);

        System.out.println("winner is " + winner2);




    }
}
