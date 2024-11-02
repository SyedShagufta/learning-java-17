package com.oops.composition.examples;

public class Monitor extends Product{

    private int size;
    private String resolution;

    public void drawPixel(int x, int y, String color)
    {
        System.out.printf("Drawing something on the screen at %d %d with the color %s%n", x, y, color);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size=size;
        this.resolution=resolution;
    }

}
