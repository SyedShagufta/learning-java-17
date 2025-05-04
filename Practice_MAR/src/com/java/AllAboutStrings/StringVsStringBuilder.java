package com.java.AllAboutStrings;

public class StringVsStringBuilder {


    public static void main(String[] args) {

        String helloWorld = "Hello"+ " World";
        // This line contains a bug
        helloWorld.concat(" and Goodbye");

        StringBuilder helloBuilder = new StringBuilder("Hello" + " World");
        helloBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInformation(emptyStart);
        printInformation(emptyStart32);

        helloBuilder.deleteCharAt(16).insert(16, "g");
        System.out.println(helloBuilder);

        helloBuilder.replace(16, 17, "G");
        System.out.println(helloBuilder);

        helloBuilder.reverse().setLength(7);
        System.out.println(helloBuilder);
    }


    public static void printInformation(String string){
        System.out.println("String = "+string);
        System.out.println("String Length = "+string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("String = "+builder);
        System.out.println("String Length = "+builder.length());
        System.out.println("Capacity = "+builder.capacity());
    }

}
