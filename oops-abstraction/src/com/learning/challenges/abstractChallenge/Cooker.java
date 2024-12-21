package com.learning.challenges.abstractChallenge;

public class Cooker extends ProductForSale{
    public Cooker(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Thank you for buying Cooker");
        System.out.println("==========".repeat(30));
        System.out.println("Please find the details of your purchase below:");
        System.out.printf("The product type is = %20s%n"+type);
        System.out.printf("Price of the product = %20f%n"+price);
        System.out.println("Description: ");
        System.out.println(description);
    }
}
