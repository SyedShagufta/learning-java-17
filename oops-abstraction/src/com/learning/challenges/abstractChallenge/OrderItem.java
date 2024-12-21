package com.learning.challenges.abstractChallenge;

public record OrderItem(int quantity, ProductForSale product) {

    @Override
    public String toString() {
        return String.format("%d X %f = %f%n",quantity, product.price,product.getSalesPrice(quantity));
    }
}
