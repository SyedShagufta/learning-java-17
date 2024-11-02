package com.learning.examples;

public class VarargsDemo {

    public static void main(String[] args) {

        String[] myTextList = {"Hello", "World"};
        printText(myTextList);

        System.out.println("================================");

        printText("Hello", "World", "Again");

    }

    private static void printText(String... textList)
    {
        for(String t: textList)
        {
            System.out.println(t);
        }
    }

}
