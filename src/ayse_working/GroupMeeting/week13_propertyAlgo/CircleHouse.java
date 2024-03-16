package ayse_working.GroupMeeting.week13_propertyAlgo;

public class CircleHouse extends Property{

    private double radius;

    public CircleHouse(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSquareMeters() {
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public String toString() {
        return super.toString().replace("{","")+
                "name='" + getName() + '\'' +
                "radisu='" + getRadius() + '\'' +
                '}';
    }
}
