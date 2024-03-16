package day28_encapsulation;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);

        System.out.println(c1.getRadius());
        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimeter());
        System.out.println(c1);
    }
}
