package com.oops.composition.challenges;

public class Refrigerator {

    private boolean hasWorkToDo;

    public void orderFood(){
        if(hasWorkToDo) {
            System.out.println("The food is being ordered !!!");
        }

    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
