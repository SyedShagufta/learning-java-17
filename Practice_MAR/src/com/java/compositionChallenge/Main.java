package com.java.compositionChallenge;

public class Main {

    public static void main(String[] args) {

        // using the getter method to call the methods

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        DishWasher dishWasher = new DishWasher();
        Refrigerator refrigerator = new Refrigerator();

//        SmartKitchen myKitchen = new SmartKitchen(coffeeMaker, dishWasher, refrigerator);
          SmartKitchen myKitchen = new SmartKitchen();

        myKitchen.setKitchenState(true, true, true);
        myKitchen.getBrewMaster().brewCoffee();
        myKitchen.getIceBox().orderFood();
        myKitchen.getDishWasher().doDishes();

        // application doesn't access the objects directly
        myKitchen.doKitchenWork();


    }

}
