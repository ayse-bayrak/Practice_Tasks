package day24_date_time;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class CountryName_6 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Ankara", "Istanbul", "Zonguldak", "Corum", "Sakarya", "Kahramanmaras"));

        countries.removeIf(p-> p.length()>=10);
        System.out.println(countries);

    }
}
/*

6. Create an ArrayList of strings called country names, and write a program
that can remove all the country names that have lengths of 10 or greater
 */