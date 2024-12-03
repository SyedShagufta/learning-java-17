package com.learning.examples;

public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equalsIgnoreCase("slow")){
            System.out.println(getExplicitType()+" swimming peacefully");
            //System.out.println(type+" swimming peacefully");
        }else{
            System.out.println(getExplicitType()+" darting frightened");
            //System.out.println(type + " darting frightened");
        }
    }

    @Override
    public void makeNoise() {
        if(type=="Goldfish"){
            System.out.print("Splash !!");
        }else{
            System.out.print("Shush !!");
        }
    }
}
