package com.basics.exercises;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
    }

    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        return (summer && temperature >= 25 && temperature <= 45) || (!summer && temperature >= 25 && temperature <= 35);
    }

}
