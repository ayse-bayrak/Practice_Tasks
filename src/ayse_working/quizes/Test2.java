package ayse_working.quizes;

public class Test2 {

    public static void main(String[] args) {

       // new Sprint().walk();

    }

}

interface Run {

    default void walk() {
        System.out.println("Walking and running.");
    }

}

interface Jog {

    default void walk() {
        System.out.println("Walking and jogging.");
    }

}

//class Sprint implements Run, Jog {
//
////    @Override
////    void walk() {
////        System.out.println("Sprinting.");
////    }
//
//}
