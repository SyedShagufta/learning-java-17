package com.learning.examples;

public class Dog extends Mammal{


    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equalsIgnoreCase("slow")){
            System.out.println(getExplicitType()+" walking");
            //System.out.println(type+" Walking");
        }else{
            System.out.println(getExplicitType()+" running");
            //System.out.println(type + " running");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType()+ " shed hair all the time");
    }

    @Override
    public void makeNoise() {
        if(type=="Wolf"){
            System.out.print("Howling !!");
        }else{
            System.out.print("Woof !!");
        }
    }
}
