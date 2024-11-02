package com.oops.polymorphism.examples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Movie starWars = new Adventure("Star Wars");
//        Movie myMovie = Movie.getMovie("Adventure", "Little Adventures");
//        myMovie.watchMovie();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Please select the movie category, Press A for Adventure, C for comedy, S for Science fiction and Q to quit");
            String type = sc.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter the Movie title");
            String title= sc.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }


}
