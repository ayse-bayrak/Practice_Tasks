package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country, title, Genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts = new ArrayList<>();

    public Movie(String country, String title, String director, LocalDate releaseDate) {
        this.country = country;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        // casts = new ArrayList<>();
        //Genre = genre;
    }

    //adds the given string argument to the ArrayList casts
    public void addCast(String name) {
        casts.add(name);
    }
    public void addCasts(String[] names) {

        casts.addAll(Arrays.asList(names));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                ", casts=" + casts +
                ", totalNumberOfCast=" + casts.size() +
                '}';
    }
}
/*
 1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the ArrayList casts
            addCasts(String[]): adds the given string array argument to the ArrayList casts
            toString(): returns the name of the country, title, release date, and the total number of casts

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