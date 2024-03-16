package day30_inheritance.sportTask;

public class TestSport {
    public static void main(String[] args) {

        Basketball basketball = new Basketball("avrupa", 10, 2, "3-3", 1, true);

        Baseball baseball = new Baseball("World", 8, 2, "hfdfd", true);

        baseball.play();
        basketball.play();

        System.out.println(baseball);
        System.out.println(basketball);

        System.out.println(basketball.getBallNumber());
        System.out.println(baseball.getNumberOfReferre());


    }
}
