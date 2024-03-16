package ayse_working.quizes;

public class Cheetah {

    int numSpots;

    public int getNumSpots() {
        return numSpots;
    }

    public void setNumSpots(int numSpots) {
        this.numSpots = numSpots;
    }

    public Cheetah() {
        this.numSpots = 35;
    }

    public Cheetah(int numSpots) {
        this();
        this.numSpots = numSpots;
    }

    public static void main(String[] args) {
        System.out.println(new Cheetah(50).numSpots);
    }

}
