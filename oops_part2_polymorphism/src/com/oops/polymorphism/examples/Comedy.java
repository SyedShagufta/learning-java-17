package com.oops.polymorphism.examples;

public class Comedy extends Movie{


    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Something Funnier Happens",
                "Something even funnier happens",
                "happy ending");
    }

    public void watchComedy(){
        System.out.println("Watching comedy");
    }
}
