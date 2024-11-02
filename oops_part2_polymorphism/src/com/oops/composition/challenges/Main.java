package com.oops.composition.challenges;

public class Main {
    public static void main(String[] args) {

        // installing the coffee maker, dishwasher and refrigerator into the kitchen
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();
        DishWasher myDishWasher = new DishWasher();
        Refrigerator myRefrigerator = new Refrigerator();

        SmartKitchen myKitchen = new SmartKitchen(myCoffeeMaker, myDishWasher, myRefrigerator);
        myKitchen.doKitchenWork();


    }
}
