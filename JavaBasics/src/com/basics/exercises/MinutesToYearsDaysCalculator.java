package com.basics.exercises;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }


    public static void printYearsAndDays(long minutes)
    {
        if(minutes < 0)
        {
            System.out.println("Invalid Value");
        }
        else{
            long totalDays = minutes / (60 * 24);
            long numOfYears = totalDays / 365;
            long numOfDays = totalDays % 365;
            System.out.println(minutes+" min = "+numOfYears+" y and "+numOfDays+" d");
        }
    }

}
