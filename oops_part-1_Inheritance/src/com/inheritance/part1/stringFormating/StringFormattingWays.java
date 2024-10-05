package com.inheritance.part1.stringFormating;

public class StringFormattingWays {

    public static void main(String[] args) {
        // formatting using text block or multiple lines in java

        String heading1 = "Print a Bulleted List : \n" +
                "\t\u2022 First Point\n"+
                "\t\t\u2022 Second Point";

        System.out.println(heading1);

        String multiLineHeading = """
                Print a Bullted List : 
                    \u2022 First Point
                        \u2022 Second Point""";

        System.out.println(multiLineHeading);

        int age = 35;
        System.out.printf("Your age is %d", age);

        int birthYear = 2024 - age;
        System.out.printf("\nYour age is %d, so your birth year must be %d", age, birthYear);

        System.out.printf("\nYour age is %f", (float)age);

        System.out.printf("\n You age is %.2f\n", (float) age);

        for(int i = 1; i<=10000 ; i=i*10){
            System.out.printf("Printing: %6d%n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);


    }

}
