package day17_custom_class;

public class Address {
    public int buildingNumber;
    public String street, city, state, zipCode;
    public static String country ="Unite States", planet = "Earth";  // I didn't understand this line

    public String toString() {
        return "Address:\n" +
                + buildingNumber +
                " " + street + "\n" + city +
                " " + state + ", "+
                 zipCode ;
    }

    public void setInfo(int buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;


    }
}
/*
5. Create a class named Address
    Attributes:
        buildingNumber, street, city, state, zipCode

    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
 */