package ayse_working.fullWeekOf.algoQ2;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", 200));
        books.add(new Book("Book2", 350));
        books.add(new Book("Book3", 150));
        books.add(new Book("Book4", 400));
        books.add(new Book("Book5", 250));

        books.removeIf(p-> p.getPages()<300);

        ArrayList<String> result = new ArrayList<>();
        for (Book each : books) {
            result.add(each.getName());
        }

        System.out.println(result);

    }
}
