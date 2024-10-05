package com.basics.examples;

public class SwitchCase {

    public static void main(String[] args) {
        String month = "MARCH";
        System.out.println(month+" is in "+getQuarter(month)+" quarter.");
    }

    public static String getQuarter(String month){
//        switch(month){
//            case "JANUARY":
//            case "FEBRUARY":
//            case "MARCH":
//                return "1st";
//            case "APRIL":
//            case "MAY":
//            case "JUNE":
//                return "2nd";
//            case "JULY":
//            case "AUGUST":
//            case "SEPTEMBER":
//                return "3rd";
//            case "OCTOBER":
//            case "NOVEMBER":
//            case "DECEMBER":
//                return "4th";
//            default:
//                return "bad month";
//        }

        return switch(month){
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "Bad "+month;
        };
    }

}
