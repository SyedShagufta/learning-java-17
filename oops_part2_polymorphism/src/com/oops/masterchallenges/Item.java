package com.oops.masterchallenges;

public class Item {
    private String name;
    private String type;
    private double price;
    private String size;

    public Item(String name, String type, double price, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public double getBasePrice(){
        return price;
    }

    private double getAdjustedPrice(){
        return price;
    }

    public void printItem(){

    }

}
