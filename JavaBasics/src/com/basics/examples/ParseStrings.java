package com.basics.examples;

public class ParseStrings {

    public static void main(String[] args) {

        int currentYear = 2024;
        String dateOfBirth = "1999";
        int date = Integer.parseInt(dateOfBirth);
        double dateD = Double.parseDouble(dateOfBirth);

        System.out.println("Years = "+ (currentYear- date));
        System.out.println("Years = "+ (currentYear-dateD));

    }

}
