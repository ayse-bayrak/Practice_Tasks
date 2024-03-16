package day28_encapsulation;

public class TestSquare {
    public static void main(String[] args) {
        Square s1 = new Square(2);

        System.out.println(s1.getSide());
        System.out.println(s1.calcArea());
        System.out.println(s1.calcPerimeter());
        System.out.println(s1);

    }
}
