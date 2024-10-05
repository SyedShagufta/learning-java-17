package com.inheritance.part1.stringFormating;

public class StringComparisonMethods {

    public static void main(String[] args) {
        String s1 = "HelloWorld";
        // equals to method
        System.out.println(("Helloworld").equals(s1.toLowerCase()));

        // equal to but ignore the case
        System.out.println(("Helloworld").equalsIgnoreCase(s1.toLowerCase()));

        // comparing the contents (mostly used to compare the two string builder objects)
        System.out.println("Hello world".contentEquals(s1));

        // contains method
       if(s1.contains("World")){
           System.out.println("Contains the World");
       }

       // ends with
        if(s1.endsWith("d")){
            System.out.println("ends with d");
        }

        // starts with
        if(s1.startsWith("H")){
            System.out.println("Starts with H");
        }


    }


}
