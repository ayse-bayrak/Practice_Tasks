package day30_inheritance.bookTask;

public class AudioBook extends Book{

    private double length;
    private String narrator;

    public AudioBook(String title, String type, String author, double price, double length, String narrator) {
        super(title, type, author, price);
        setLength(length);
        setNarrator(narrator);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){
            System.err.println(length + " is invalid data, length can not be set to zero or negative!");
            System.exit(1);
        }
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
    public void listen(){
        System.out.println("Listening to "+getTitle());
    }

    public String toString() { // How can I add Extra Methods: toString(), I did this like but is there any other way
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                ", title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
/*
Create a sub-class of Book named AudioBook:
			Extra variables:
				length, narrator

			Encapsulate all the extra fields
					Conditions:
						1. length can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				toString()
 */