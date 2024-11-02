package com.oops.encapsulation.challenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    private boolean duplex;



    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = Math.max(tonerLevel, 0);
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int tempAmount = tonerAmount + tonerLevel;
        return (tempAmount > 100 || tempAmount < 0)? -1 : tempAmount;
    }

    public int printPages(int pages){
        // if the pages are even number - pages/2
        // if the pages are odd - (pages / 2 ) and the remainder
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;

    }



}

