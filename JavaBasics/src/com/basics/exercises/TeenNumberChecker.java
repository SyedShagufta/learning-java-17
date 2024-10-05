package com.basics.exercises;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(18, 23, 29));
    }
    public static boolean hasTeen(int n1, int n2, int n3)
    {

        return (isTeen(n1) || isTeen(n2) || isTeen(n3));

    }

    public static boolean isTeen(int age)
    {
        return age >= 13 && age <= 19;
    }
}