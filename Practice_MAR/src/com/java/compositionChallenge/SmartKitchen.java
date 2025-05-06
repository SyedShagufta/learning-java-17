package com.java.compositionChallenge;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public void addWater(){
        brewMaster.hasWorkToDo = true;
    }

    public void pourMilk(){
        iceBox.hasWorkToDo = true;
    }

    public void loadDishWasher(){
        dishWasher.hasWorkToDo = true;
    }

    public void setKitchenState(boolean coffeeMakerState, boolean refrigeratorState, boolean dishWasherState){
        brewMaster.hasWorkToDo = coffeeMakerState;
        iceBox.hasWorkToDo = refrigeratorState;
        dishWasher.hasWorkToDo = dishWasherState;
    }

    public void doKitchenWork()
    {
        addWater();
        brewMaster.brewCoffee();
        pourMilk();
        iceBox.orderFood();
        loadDishWasher();
        dishWasher.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}

class Refrigerator {
    protected boolean hasWorkToDo;

    public void orderFood(){
        if(hasWorkToDo) {
            System.out.println("Ordering food");
            hasWorkToDo=false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class DishWasher {
    protected boolean hasWorkToDo;

    public void doDishes(){
        if(hasWorkToDo) {
            System.out.println("Do dishes");
            hasWorkToDo=false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class CoffeeMaker {
    protected boolean hasWorkToDo;

    public void brewCoffee(){
        if(hasWorkToDo) {
            System.out.println("Brewing coffee");
            hasWorkToDo=false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}