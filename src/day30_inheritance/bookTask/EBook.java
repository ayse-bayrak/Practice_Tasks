package day30_inheritance.bookTask;

public class EBook extends Book {
    private String size;
    private int pages;

    public EBook(String title, String type, String author, double price, String size, int pages) {
        super(title, type, author, price);
        setSize(size);
        setPages(pages);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if ( pages<= 0){
            System.err.println(pages + ": invalid page, pages can not be set to zero or negative!");
            System.exit(1);
        }
        this.pages = pages;
    }

    public void readBook() {
        System.out.println(getTitle() + " is reading");
    }


    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", size='" + size + '\'' +
                ", pages='" + pages + '\'' +
                        '}';
    }
}
/*
2 Create a subclass of Book named EBook:
			Extra variables:
				size, pages

			Encapsulate all the extra fields
					Conditions:
						1. pages can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				readBook()
 */