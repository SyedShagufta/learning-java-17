package com.oops.encapsulation.exercise;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        return (tonerAmount > 0 && tonerAmount <= 100) ? (tonerLevel+tonerAmount > 100 )? -1: (tonerLevel+=tonerAmount):-1;

    }

    public int printPages(int pages){
        if(duplex){
            System.out.println("Printing in duplex mode");
        }
        int pagesToPrint = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
