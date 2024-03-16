package day28_encapsulation;

public class TestItem {
    public static void main(String[] args) {

        Item item1 = new Item("toilet paper", 13.5, 1);
        System.out.println(item1.calcCost());
        System.out.println(item1);

    }
}
