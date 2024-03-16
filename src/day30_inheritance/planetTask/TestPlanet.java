package day30_inheritance.planetTask;

public class TestPlanet {
    public static void main(String[] args) {

        Earth earth = new Earth("Ankara", 23.78, 56.9, 67.9, 78,9, 60000000,true);
        System.out.println(earth);


        System.out.println(earth.getName());
        System.out.println(earth.isHasLife());

    }
}
