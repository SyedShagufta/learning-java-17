package com.basics.challenges;

public class OperatorPrecedenceChallenge {

    public static void main(String[] args) {

        double var1 = 20.00;
        double var2 = 80.00;

        double res1 = (var1 + var2) * 100.0;

        System.out.println(res1);

        double res2 = res1 % 40.00;

        System.out.println(res2);

        boolean isZero = res2 == 0.0;

        System.out.println(isZero);

        if(!isZero){
            System.out.println("Got some remainder.");
        }
    }

}
