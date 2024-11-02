package com.oops.polymorphism.examples;

public class nextMain {

    public static void main(String[] args) {


        // casting
        Movie movie = Movie.getMovie("A", "Star wars");
        movie.watchMovie();

        Adventure advMovie = (Adventure) Movie.getMovie("A", "Jaws");
        advMovie.watchMovie();

//        Object comedy = Movie.getMovie("C", "Comedy movie");
//        comedy.watchMovie();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();


        Object unknownObject = Movie.getMovie("S", "Airplane");

        if(unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }
        else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        }
        else if(unknownObject instanceof ScienceFiction scifi){
            scifi.watchScienceFiction();
        }


    }

}
