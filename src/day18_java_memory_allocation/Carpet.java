package day18_java_memory_allocation;

public class Carpet {

    public double width, length, unitPrice;
    boolean isPersian;

    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double total = width * length * unitPrice;
        return isPersian ? total+200 : total;
    }



    public String toString() {
        return "Carpet: " +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price of carpet=" + calcCost() ;
    }

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();
        carpet1.setInfo(2.3, 5.8, 6, false);

        Carpet carpet2 = new Carpet();
        carpet2.setInfo(2.3, 5.8, 6, true);

        System.out.println(carpet1);
        System.out.println(carpet2);

    }
}
/*
Create a class named Carpet:
	 		Attributes:

                width
                length
                unitPrice
                isPersian


            Actions:
        		setInfo(): sets all the fields
                calcCost(): should be able to calculate the total cost of the carpet and return it as double
                toString(): should be able to display all the info about the carpet including the total cost of the carpet as calculated by calcCost()


		    total price of carpet = (width*length) * unit-price

		    if the carpet is Persian  carpet, add 200$ to the totalPrice
 */