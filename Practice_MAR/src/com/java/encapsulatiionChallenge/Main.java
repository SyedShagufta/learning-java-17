package com.java.encapsulatiionChallenge;

public class Main {

    public static void main(String[] args) {
        Printer printer1 = new Printer();
        System.out.println(printer1.printPages(3));
        System.out.println(printer1.printPages(4));
        System.out.println("No of pages in pages Printed = "+printer1.getPagesPrinted());
    }

}
