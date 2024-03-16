package ayse_working.quizes;

public class Test {

    public static void main(String[] args) {
        new Mammal(5);
    }

}

//class Platypus extends Mammal {
//
////    public Platypus() {//There is no default constructor available in 'ayse_working.quizes.Mammal'
////        System.out.println("Platypus");
////    }
//
//}

class Mammal {

    public Mammal(int age) {
        System.out.println("Mammal");
    }

}