package com.inheritance.part1.exercises;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }


    public void add(ComplexNumber imaginary)
    {
        this.add(imaginary.real, imaginary.imaginary);
    }

    public void add(double real , double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void subtract(double real , double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber imaginary)
    {
        this.subtract(imaginary.real, imaginary.imaginary);
    }



    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }


}
