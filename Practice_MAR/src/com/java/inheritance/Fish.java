package com.java.inheritance;

import java.util.Objects;

public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish(String type,  double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("muscles moving");
    }

    private void moveBackFin(){
        System.out.println("back fin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(Objects.equals(speed, "fast")){
            moveBackFin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
