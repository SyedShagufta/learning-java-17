package com.basics.exercises;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(95.75);
    }
    public static long toMilesPerHour(double kilometersPerHour)
    {
        long milesPerHour;
        if(kilometersPerHour < 0){
            milesPerHour = -1;
        }
        else{
            milesPerHour = (long) Math.round(kilometersPerHour / 1.609);
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour)
    {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour + " km/h = "+milesPerHour+" mi/h");
        }
    }

}