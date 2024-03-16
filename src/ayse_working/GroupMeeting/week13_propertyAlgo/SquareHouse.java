package ayse_working.GroupMeeting.week13_propertyAlgo;

public class SquareHouse extends Property {

    private double side;

    public SquareHouse(String name, double side) {
        super(name);
        this.side = side;
    }

    public SquareHouse(double side) {
        super();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double calculateSquareMeters() {
        return getSide()*getSide();
    }

    public String toString() {
        return super.toString().replace("{","")+
                "name='" + getName() + '\'' +
                "side='" + getSide() + '\'' +
                '}';
    }

}
