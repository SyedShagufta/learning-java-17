package com.java.polymorphism;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie theWatchMovie = new Comedy("Star wars");
//        theWatchMovie.watchMovie();

        Movie theMovie = Movie.getMovie("Science Fiction", "Inception");
        theMovie.watchMovie();

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Choose the type of the movie you wanna watch. C for Comedy, A for Adventure, S for Science fiction and Q to Quit:");
            String type = sc.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Choose the title of the movie:");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}
