package com.basics.challenges;

public class ForLoopChallenge {

    public static void main(String[] args) {

        for(double rate=7.5; rate <= 10.0; rate=rate+0.25)
        {
            System.out.println("100 at "+rate+" % interest = "+calculateInterestRate(100, rate));
        }

    }

    public static double calculateInterestRate(double amount, double interestRate)
    {
        return (amount * (interestRate / 100));
    }

}
