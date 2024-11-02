package com.oops.composition.challenges;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox)
    {
        this.brewMaster=brewMaster;
        this.dishWasher=dishWasher;
        this.iceBox=iceBox;
    }

    private void addWater(){
        System.out.println("Turing on the coffee maker and adding water");
        brewMaster.setHasWorkToDo(true);
    }

    private void pourMilk(){
        System.out.println("pouring milk in the refrigerator");
        iceBox.setHasWorkToDo(true);
    }

    private void loadDishWasher(){
        System.out.println("Loading dish washer");
        dishWasher.setHasWorkToDo(true);
    }

    private void setKitchenState(boolean coffeeMakerState, boolean dishWasherState, boolean refrigeratorState){
        brewMaster.setHasWorkToDo(coffeeMakerState);
        dishWasher.setHasWorkToDo(dishWasherState);
        iceBox.setHasWorkToDo(refrigeratorState);
        System.out.println("Setting the coffee make state to "+coffeeMakerState);
        System.out.println("Setting the dishwasher state to "+dishWasherState);
        System.out.println("Setting the Refrigerator state to "+refrigeratorState);
    }

    public void doKitchenWork(){
        // Making coffee
        addWater();
        brewMaster.brewCoffee();
        // Doing dishes
        loadDishWasher();
        dishWasher.doDishes();
        // pouring milk into refrigerator
        pourMilk();
        iceBox.orderFood();
    }

}
