package com.oops.encapsulation.challenge;

public class Main {

    public static void main(String[] args) {

        Printer myprinter = new Printer(50, true);
        System.out.println("Initial pages = "+myprinter.getPagesPrinted());

        int pagesPrinted = myprinter.printPages(5);

        System.out.printf("current job pages: %d, Printer Total: %d %n",
                pagesPrinted, myprinter.getPagesPrinted());

        pagesPrinted = myprinter.printPages(10);

        System.out.printf("current job pages: %d, Printer Total: %d %n",
                pagesPrinted, myprinter.getPagesPrinted());

    }
}
