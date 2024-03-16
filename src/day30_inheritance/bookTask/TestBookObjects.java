package day30_inheritance.bookTask;

public class TestBookObjects {
    public static void main(String[] args) {

        EBook eBook = new EBook("Mor Murekkep", "Deneme", "Nazan Bekiroglu", 45.0, "medium", 234);

        AudioBook audioBook = new AudioBook("7 Habits", " business", "Steohan", 75.0, 13.2, "Serdar Kuzuloglu");

        System.out.println(eBook);
        System.out.println(audioBook);

        eBook.readBook();

        System.out.println();
    }
}
