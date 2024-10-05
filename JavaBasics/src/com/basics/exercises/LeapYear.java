package com.basics.exercises;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2100));
    }

    public static boolean isLeapYear(int year)
    {
        return year >= 1 && year <= 9999 && (year%4 == 0 && year%100 != 0 || year%400 ==0);
    }

}