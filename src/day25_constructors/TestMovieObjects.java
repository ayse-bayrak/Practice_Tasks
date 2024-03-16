package day25_constructors;

import java.time.LocalDate;

public class TestMovieObjects {

    public static void main(String[] args) {


//        m1.addCast("Ozzy");
//        m1.addCast("Jamal");
//        m1.addCast("Muhtar");
//        m1.addCast("Esma");
//        m1.addCast("Zeynep");
//        m1.addCast("Arzugul");

        String[] casts = {"Ozzy", "Jamal", "Muhtar", "Esma", "Zeynep", "Arzugul"};
        Movie m1 = new Movie("USA", "Java Developer: Zero to Hero","Kuzat Altay", LocalDate.of(2023, 10, 29) );

        m1.addCasts(casts);

        m1.Genre = "Adventure, Comedy, Thriller";

        System.out.println(m1);

    }

}
/*
 2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/29/2023
                    Director: Kuzzat Altay
                    Casts: Ozzy, Jamal, Muhtar and 5 more students from your group

        print the full info of the movie
 */