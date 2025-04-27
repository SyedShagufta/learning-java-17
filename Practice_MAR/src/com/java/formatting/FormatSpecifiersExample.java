package com.java.formatting;

public class FormatSpecifiersExample {

    public static void main(String[] args) {
        // % [Argument_index$] [flags] [width] [.precision] conversion
        int age = 22;
        int yearOFBirth = 2002;
        // % [Argument_index$]
        // prints second argument in the list and then 1st argument
        System.out.printf("%2$d %1$d%n", age, yearOFBirth);

        // [flags]
        // - left align
        System.out.printf("%-10s%n", "hello");
        // + always show sign for example
        System.out.printf("%+d%n", age);
        age = -10;
        System.out.printf("%+d%n", age);
        // pad with zeros -
        System.out.printf("%05d%n", 234);
        // use locale specifying group separators
        System.out.printf("%,d%n", 1000000);

        // [width]
        // 7 spaces and then cat
        System.out.printf("%10s%n", "cat");


        // [precision]
        System.out.printf("%.2f", 3.14577878);

    }

}
