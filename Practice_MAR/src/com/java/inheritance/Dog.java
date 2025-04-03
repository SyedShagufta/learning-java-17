package com.java.inheritance;

import java.util.Objects;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    public Dog(String type,  double weight, String tailShape, String earShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.tailShape = tailShape;
        this.earShape = earShape;
    }

    @Override
    public void makeNoise() {
        if(Objects.equals(type, "wolf")){
            System.out.println("woof");
        }
        else{
            System.out.println("Bow bow");
        }
    }

    private void bark(){
        System.out.println("Dog is barking");
    }

    private void run(){
        System.out.println("Dog is running !");
    }

    private void walk(){
        System.out.println("Dog is walking");
    }

    private void wagTail(){
        System.out.println("wagging the tail");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(Objects.equals(speed, "slow")){
            walk();
            wagTail();
        }
        else{
            run();
            bark();
        }
    }
}
