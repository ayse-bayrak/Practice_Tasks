package day27_access_modifier;

public class Iphone {
    public String  model, size, color;
    public double price;

    public static String OS;
    public static boolean isSmartPhone;
    public static String brand, madeIn, designedIn;

    public Iphone(String model, String size, String color, double price) {

        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static {
        OS = "IOS";
        isSmartPhone = true;
        madeIn = "USA";
        designedIn = "China";
        brand = "Apple";
    }

    public static void printOperatingSystem() {
        System.out.println("the operating system of the iphone is " + OS);
    }

    public void call(long phoneNumber) {
        System.out.println(model + "Call to this number: " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(model +  "is texting to: " + phoneNumber );
    }

    public void faceTime(long phoneNumber) {
        System.out.println(model + " is face timing with " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(model+ " is face timing with email: " + email);
    }

    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialize all the fields.

            Add a static block to initialize all the statics.

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()

 */