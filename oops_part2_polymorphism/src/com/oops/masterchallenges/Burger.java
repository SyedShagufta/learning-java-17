package com.oops.masterchallenges;

public class Burger extends Item{

    private Item extra1;
    private Item extra2;
    private Item extra3;


    public Burger(String type, double price) {
        super("Burger", type, price, "regular");
    }

    public void addToppings(Item extra1){

    }

}
