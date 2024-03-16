package day28_encapsulation;

public class TestPizza {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("mediUm", 2, 2);

        System.out.println(pizza1.calcCost());
        System.out.println(pizza1);
    }
}
