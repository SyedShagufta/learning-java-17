package com.oops.composition.examples;

public class ComputerCase extends Product{

    private String powerSupply;

    public void pressPowerButton(){
        System.out.println("Pressing the power button on the computer case");
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply=powerSupply;
    }
}
