package com.learning.examples;

import java.util.Scanner;

public class MonthsExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        // System.out.printf("%s is in the %s Quarter of the year",month, getQuarterFromTraditionalSwitch(month.toUpperCase()));
        System.out.printf("%s is in the %s Quarter of the year",month, getQuarterFromEnhancedSwitch(month.toUpperCase()));
    }

    public static String getQuarterFromEnhancedSwitch(String month)
    {
        return switch (month){
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> month + " is bad";

        };
    }

    public static String getQuarterFromTraditionalSwitch(String month)
    {
        switch (month)
        {
            case "JANUARY": case "FEBRUARY": case "MARCH":
                return "1st";
            case "APRIL": case "MAY": case "JUNE":
                return "2nd";
            case "JULY": case "AUGUST": case "SEPTEMBER":
                return "3rd";
            case "OCTOBER": case "NOVEMBER": case "DECEMBER":
                return "4th";
        }
        return "bad";
    }

}
