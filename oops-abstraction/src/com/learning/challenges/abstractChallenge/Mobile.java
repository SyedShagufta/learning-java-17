package com.learning.challenges.abstractChallenge;

public class Mobile extends ProductForSale{

    private int warrantyYears = 3;

    public Mobile(String type, double price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {
        System.out.println("Thank you for buying Apple mobile phone");
        System.out.println("==========".repeat(30));
        System.out.println("Please find the details of your purchase below:");
        System.out.printf("The product type is = %20s%n"+type);
        System.out.printf("Price of the product = %20f%n"+price);
        System.out.println("Description: ");
        System.out.println(description);
        System.out.printf("The warranty for this product = %20d%n"+warrantyYears);
    }

    public void extendWarranty(int years)
    {
        warrantyYears+=years;
    }


}
