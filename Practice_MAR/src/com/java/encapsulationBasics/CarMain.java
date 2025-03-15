package com.java.encapsulationBasics;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setColor("black");
        car.setConvertible(true);
        car.setModel("Model Desire Z");
        car.setDoors(4);
        car.describeCar();
    }
}
