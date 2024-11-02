package com.oops.polymorphism.challenge;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Starting the Engine");
    }

    public void drive(){
        System.out.println("driving the type is - " + this.getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("running the engine");
    }

}
