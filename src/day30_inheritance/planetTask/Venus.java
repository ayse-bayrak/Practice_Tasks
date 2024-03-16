package day30_inheritance.planetTask;

public class Venus extends Planet {
    private boolean hasShape;

    public Venus(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume, int population, boolean hasShape) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);
        setHasShape(hasShape);
    }

    public boolean isHasShape() {
        return hasShape;
    }

    public void setHasShape(boolean hasShape) {
        this.hasShape = hasShape;
    }
}
