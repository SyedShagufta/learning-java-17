package com.learning.practice;

public class Vargs {

    public static void main(String... args) {

        System.out.println("Hello world again");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("-".repeat(20));
        System.out.println("trying with vargs method");
        printTextUsingVargs(splitStrings);
        System.out.println("-".repeat(20));
        printTextUsingVargs("Hello");
        System.out.println("-".repeat(20));
        // we can pass array elements as arguments
        printTextUsingVargs("hey", "hello", "again");

    }

    private static void printText(String[] textList){
        for (String t: textList){
            System.out.println("t = " + t);
        }
    }

    private static void printTextUsingVargs(String... textList){
        for (String t: textList){
            System.out.println("t = " + t);
        }
    }


}
