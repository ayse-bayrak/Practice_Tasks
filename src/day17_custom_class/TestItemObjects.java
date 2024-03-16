package day17_custom_class;

public class TestItemObjects {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.setInfo("book", 27, 3 );

        item1.calcCost();

        System.out.println(item1);

    }
}
