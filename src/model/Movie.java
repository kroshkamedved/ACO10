package model;


import java.time.LocalDate;
import java.util.ArrayList;

public class Movie implements Comparable<Movie> {
    private int id;
    private String title;
    private String originalTitle;
    private int year;
    private ArrayList<String> genres;
    private String budget;
    private ArrayList<Person> directors;
    private ArrayList<Person> actors;
    private ArrayList<String> countries;
    private int ageLimit;
    //    todo maybe String
    private int duration;
    private LocalDate wordPremiere;
    private LocalDate uaPremiere;
    private String description;
    private String studio;

//    todo Image
    private String posterURL;
    private volatile int hashCode = 0;

//todo compareTo
    @Override
    public int compareTo(Movie o) {
        return 0;
    }
}
