package com.oops.composition.examples;

public class Motherboard extends Product{

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public void loadProgram(String programName)
    {
        System.out.println("Loading the program .... "+programName);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots=ramSlots;
        this.cardSlots=cardSlots;
        this.bios=bios;
    }
}
