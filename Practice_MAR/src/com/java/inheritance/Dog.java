package com.java.inheritance;

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
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("This is from the Dog's class");
    }
}
