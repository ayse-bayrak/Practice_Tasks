package day29_inharitance.Car;

public class Car {

    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    public void setInfo(String model, int year, String color, double price) {
        setMake(getClass().getSimpleName());// sets the class name to the make of the car
        setModel(model);
        setYear(year);
        setColor(color);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            System.err.println(year + " : invalid year, year can not be zero or negative!");
            System.exit(1);
        } this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println(price + " : invalid price, price can not be zero or negative!");
            System.exit(1);
        }
        this.price = price;
    }


    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*

1. Create a class named Toyota
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Toyota" and rest of the fields will be set based on the given arguments
					toString(): prints Toyota object info when the object is passed in the print statement

	2. Create a class named Honda
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Honda" and rest of the fields will be set based on the given arguments
					toString(): prints toyota object info when the object is passed in the print statement


	3. Create a class named BMW
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "BMW" and rest of the fields will be set based on the given arguments
					toString(): prints bmw object info when the object is passed in the print statement

	4. Create a class named Mercedes
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Mercedes" and rest of the fields will be set based on the given arguments
					toString(): prints mercedes object info when the object is passed in the print statement


	5. Create a class named Audi
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Audi" and rest of the fields will be set based on the given arguments
					toString(): prints audi object info when the object is passed in the print statement

	5. Create a class named Volvo
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Volvo" and rest of the fields will be set based on the given arguments
					toString(): prints volvo object info when the object is passed in the print statement

 */