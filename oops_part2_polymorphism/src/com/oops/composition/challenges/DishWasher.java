package com.oops.composition.challenges;

public class DishWasher {

    private boolean hasWorkToDo;

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Doing dishes !!!!!!");
        }
    }
    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

}
