package com.oops.masterchallenges;

public class MealOrder {
    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder(Burger burger, Item drink, Item side) {
        this.side = side;
        this.drink = drink;
        this.burger = burger;
    }

    public MealOrder() {
    }


}
