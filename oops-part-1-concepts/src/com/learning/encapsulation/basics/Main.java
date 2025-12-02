package com.learning.encapsulation.basics;

public class Main {

    public static void main(String[] args) {
        // Creating an object of car using new keyword
        Car car1 = new Car();
        // This will give the default values (0 for int, null for String)
        car1.describeCar();

        // setting the values using getters and setters
        Car car2 = new Car();
        car2.setMake("Rolls-royce");
        car2.setModel("Phantom");
        car2.setDoors(4);
        car2.setConvertible(true);

        car2.describeCar();

        Car car3 = new Car();
        car3.setMake("Bugatti");
        car3.setModel("Chiron Super Sport");
        car3.setDoors(2);
        car3.setConvertible(true);
        System.out.println("Make = "+car3.getMake());
        System.out.println("Model = "+car3.getModel());
        System.out.println("Doors = "+car3.getDoors());
        System.out.println("Convertible = "+car3.isConvertible());
    }

}
