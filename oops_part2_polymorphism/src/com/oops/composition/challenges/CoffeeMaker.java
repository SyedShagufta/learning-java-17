package com.oops.composition.challenges;

public class CoffeeMaker {

    private boolean hasWorkToDo;

    public void brewCoffee(){
        try {
            if (this.hasWorkToDo) {
                System.out.println("brewing fresh coffee !!");
            }
        }
        catch (NullPointerException e){
            System.out.println("idk what's causing Null pointer exception either");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
