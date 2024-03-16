package day17_custom_class;

public class TestRectangleObject {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(12,4);

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println(rectangle1);
    }
}
