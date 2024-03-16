package ayse_working.quizes;

public class QuestionY {

    public static void main(String[] args) {
        
        new Sprint().walk();

    }

}

interface Run1 {

    default void walk() {
        System.out.println("Walking and running.");
    }

}

interface Jog1 {

    default void walk() {
        System.out.println("Walking and jogging.");
    }

}

class Sprint implements Jog1, Run1 {

    @Override
    public void walk() {
        Jog1.super.walk();
    }
}

