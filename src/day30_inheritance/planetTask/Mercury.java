package day30_inheritance.planetTask;

public class Mercury extends Planet {
    private boolean hasLife;

    public Mercury(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume, int population, boolean hasLife) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);
        setHasLife(hasLife);
    }

    public boolean isHasLife() {
        return hasLife;
    }

    public void setHasLife(boolean hasLife) {
        this.hasLife = hasLife;
    }
}
