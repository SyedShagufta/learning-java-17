package com.oops.polymorphism.examples;

public class ScienceFiction extends Movie{


    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Aliens are coming !",
                "This is the end",
                "Big Blow");
    }

    public void watchScienceFiction(){
        System.out.println("Watching Science fiction");
    }

}
