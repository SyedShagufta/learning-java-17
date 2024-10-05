package com.basics.exercises;

public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {
        int first = (int) (num1 * 1000);
        int second = (int) (num2 * 1000);

        return first == second;
    }
}