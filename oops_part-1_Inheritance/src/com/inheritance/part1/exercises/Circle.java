package com.inheritance.part1.exercises;

public class Circle {

    private double radius;

    public Circle(double radius)
    {
        this.radius = (radius < 0)? 0 : radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){

        // return radius*radius*Math.PI;
        return Math.pow(radius, 2) * Math.PI;
    }

}
