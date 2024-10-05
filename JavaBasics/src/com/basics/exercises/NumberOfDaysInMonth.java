package com.basics.exercises;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(12, 100000));
        System.out.println(getDaysInMonth(3, 2024));
        System.out.println(getDaysInMonth(13, 2024));
    }

    public static boolean isLeapYear(int year)
    {
        return year >= 1 && year <= 9999 && (year%4 == 0 && year%100 != 0 || year%400 ==0);
    }

    public static int getDaysInMonth(int month, int year)
    {
        // validating both year and month
        if(year < 1 || year > 9999 || month < 1 || month > 12)
        {
            return -1;
        }

        return switch(month)
        {
            // modified the case 2 using ternary operator
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            // modified the default to return 31 as they have most number of cases
            default -> 31;
        };

    }
}