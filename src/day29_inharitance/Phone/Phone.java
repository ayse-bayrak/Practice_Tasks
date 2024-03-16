package day29_inharitance.Phone;

public class Phone {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (brand.isEmpty()|| brand.isBlank()||brand.equals(null)) {
            System.err.println("Invalid brand: " + brand + ", brand can not be null/empty/blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty()|| model.isBlank()||model.equals(null)) {
            System.err.println("Invalid model: " + model + ", model can not be null/empty/blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 1) {
            System.err.println("Invalid price: " + price + ", price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()|| color.isBlank()||color.equals(null)) {
            System.err.println("Invalid color: " + color + ", color can not be null/empty/blank");
            System.exit(1);
        }
        this.color = color;
    }

    public void setInfo(String model, String size, double price, String color) {
        setBrand(getClass().getSimpleName());
        //setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public void call(long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + " is calling to " + phoneNumber );
    }

   public void text(long phoneNumber) {
       System.out.println(getBrand() + " " + getModel() + " is texting to " + phoneNumber);
   }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
phoneTask
	1. Create a named IPhone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Apple" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString(): prints Iphone object info when the object is passed in the print statement

	2. Create a class named Samsung:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Samsung" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString(): prints samsung object info when the object is passed in the print statement

	3. Create a class named Nokia:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Nokia" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString(): prints nokia object info when the object is passed in the print statement
 */