package day34_abstract_interface.deviceTask;

public abstract class Device {

    private final String brand, model, size;
    private double price;
    private String color;
    public static boolean hasBattery = true,
            hasPowerButton=true;

    public Device(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        if (brand == null) {
            throw new RuntimeException("invalid brand: " + brand + ", brand can not be null");
        }
        this.brand = brand;
        if (model == null) {
            throw new RuntimeException("invalid model: " + model + ", model can not be null");
        }
        this.model = model;
        if (size == null) {
            throw new RuntimeException("invalid size: " + size + ", size can not be null");
        }
        this.size = size;
        setPrice(price);
        setColor(color);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
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
            throw new RuntimeException("invalid color: " + color + ", color can not be null");
        }
        this.color = color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn(); // abstract method
    public abstract void turnOff();// abstract method

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields.

			Add a constructor to set all the fields.

						Condition:
							1. brand, model color, and size can not be null (if obj == null means it's an error)
							2. brand, model color, and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price
 */