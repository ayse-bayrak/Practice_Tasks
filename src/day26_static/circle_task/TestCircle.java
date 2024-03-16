package day26_static.circle_task;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3.5);

        System.out.println("Area is " + c1.calcArea());
        System.out.println("Perimeter is "+ c1.calcPerimeter());
        System.out.println("Pi Value is " + Circle.pi);

    }
}
