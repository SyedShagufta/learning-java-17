package com.inheritance.part1.stringFormating;

public class StringInspectionMethods {


    public static void main(String[] args) {
        printInfo("Hello world");
        printInfo("   ");
        printInfo("\t");
    }

    public static void printInfo(String str){
        if(str.isEmpty()){
            System.out.println("The string is empty");
            return;
        }
        if(str.isBlank()){
            System.out.println("The string is blank");
        }
        System.out.println("The length of the given string is "+str.length());
        System.out.printf("The first character = %c %n The last character = %c %n", str.charAt(0), str.charAt(str.length()-1));

    }

}
