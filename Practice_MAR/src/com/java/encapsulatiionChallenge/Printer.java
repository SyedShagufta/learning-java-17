package com.java.encapsulatiionChallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer() {
        tonerLevel = 80;
        duplex = true;
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = (tonerLevel > 0 && tonerLevel <= 100)? tonerLevel: -1;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerLevel+tonerAmount > 0 && tonerLevel+tonerAmount <= 100) {
            this.tonerLevel += tonerAmount;
        }
        return (tonerLevel > 0 && tonerLevel <= 100)? tonerLevel: -1;
    }

    public int printPages(int pages){
      int jobPages = (duplex) ? (pages/2)+(pages%2):pages;
      pagesPrinted+=jobPages;
      return jobPages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
