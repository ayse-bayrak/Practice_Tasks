package day34_abstract_interface.carTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;

    protected Car(String make, String model, int year, double price, String color) {
        if (make == null) {
            throw new RuntimeException("invalid make: " + make + ", make can not be null");
       // terminate("Invalid make: "+make);
        }
        this.make = make;
        if (model == null) {
            throw new RuntimeException("invalid model: " + model + ", model can not be null");
        }
        this.model = model;
        if (year < 1886) {
            throw new RuntimeException("invalid model: " + model + ", model can not be null");
        }
        this.year = year;
        setColor(color);
        setPrice(price);
    }
/*
        private void terminate(String message){
        System.err.println(message);
        System.exit(1);
    }
 */
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new RuntimeException("invalid price: " + getPrice() + ", price can not be null");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            throw new RuntimeException("invalid color: " + getColor() + ", color can not be null");
        }
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();

    public void stop() {
        System.out.println("Press the break to stop the car "+make+" "+model);
    }



    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
