package ayse_working.GroupMeeting.week13_propertyAlgo;

public class RectangleHouse extends Property{
    private double length, width;

    public RectangleHouse(String name, double length, double width) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateSquareMeters() {
        return getLength()*getWidth();
    }

    public String toString() {
        return super.toString().replace("{","")+
                "name='" + getName() + '\'' +
                "length='" + getLength() + '\'' +
                "width='" + getWidth()+ '\'' +
                '}';
    }
}
