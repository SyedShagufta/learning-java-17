package com.inheritance.part1.exercises;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    // method that calculates the addition of two numbers
    public double getAdditionResult(){
        return this.firstNumber+this.secondNumber;
    }

    // method that subtracts second number from first
    public double getSubtractionResult(){
        return this.firstNumber-this.secondNumber;
    }

    // method that gets the multiplication of two numbers
    public double getMultiplicationResult(){
        return this.firstNumber*this.secondNumber;
    }

    // method that gets the division of two numbers
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        return this.firstNumber/this.secondNumber;
//        try{
//            return this.firstNumber/this.secondNumber;
//        }
//        catch (ArithmeticException e){
//            return 0;
//        }
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
