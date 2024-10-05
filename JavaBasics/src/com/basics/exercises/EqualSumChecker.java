package com.basics.exercises;

public class EqualSumChecker {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, 2, 3));
    }

    public static boolean hasEqualSum(int first, int second, int third)
    {
        return (first+second) == third;
    }

}