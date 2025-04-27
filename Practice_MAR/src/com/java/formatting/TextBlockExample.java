package com.java.formatting;

public class TextBlockExample {

    public static void main(String[] args) {

        System.out.println("String formatted before using concatenation");
        String bulleted = "Print a Bulleted List: \n"+
                "\t \u2022 First point\n"+
                "\t \t \u2022 Sub point\n";

        System.out.println(bulleted);
        System.out.println("String formatted using text block");
        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";
        System.out.println(textBlock);

        System.out.println("==============".repeat(15));

        int age = 35;
        System.out.printf("Your age is %d\n", age);
        int yearOfBirth = 2025-age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }

}
