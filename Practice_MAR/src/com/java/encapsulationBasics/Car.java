package com.java.encapsulationBasics;

public class Car {

    // creating a few private fields for Car class
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make==null){ this.make = "Undefined"; return;}
        String makeLowerCase = make.toLowerCase();
        switch(makeLowerCase){
            case "porsche", "holden", "tesla" -> this.make = make;
            default -> this.make = "Unsupported";
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    // printing out the details of the car
    public void describeCar(){
        System.out.printf("Make = %s\nModel = %s\nColor = %s\n", this.make, this.model, this.color);
        System.out.println((convertible ? "Convertible" : "Not Convertible"));
    }

}
