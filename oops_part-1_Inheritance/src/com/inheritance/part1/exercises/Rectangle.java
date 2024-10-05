package com.inheritance.part1.exercises;

public class Rectangle {

    private double width;
    private double length;

    public double getArea(){
        return width*length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Rectangle(double width, double length){
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }
}
