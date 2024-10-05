package com.basics.examples;

public class ForLoop {

    public static void main(String[] args) {

        for(double rate=2.0; rate <= 5.0; rate++)
        {
            System.out.println("10,000 at "+ rate+" % interest = "+calculateInterest(10000, rate));
        }

    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * (interestRate / 100));
    }

}
