package com.learning.practice;

import java.util.Random;


public class EnumExample {

    public enum Topping{
        MUSTARD,
        PICKLES,
        BACON,
        CHEDDAR,
        TOMATO;

        public double getPrice(){
            return switch(this){
                case MUSTARD -> 0.5;
                case CHEDDAR -> 1.5;
                default -> 1;
            };
        }
    }

    // creating an enum for the days of the week
    public enum DaysOfTheWeek{
        MON, TUES, WEDNES, THURS, FRI, SAT, SUN
    }

    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.FRI;
        System.out.println("The day is "+day);

        // using the methods .name() and .ordinal()
        System.out.printf("name : %s index/ordinal : %d%n", day.name(), day.ordinal());
        DaysOfTheWeek myDay = getRandomDay();
        System.out.println(myDay);
        if(myDay.name().equalsIgnoreCase("FRI")){
            System.out.println("Hurray! It's weekend");
        }

        for (int i=0; i<10; i++){
            var daysOfTheWeek = getRandomDay();
            switchWithEnum(daysOfTheWeek);
        }

        for(Topping topping : Topping.values()){
            System.out.println(topping.name()+" -> "+topping.getPrice());
        }

    }

    public static void switchWithEnum(DaysOfTheWeek day){
        int dayInWeek = day.ordinal() + 1;
        switch (day){
            case FRI -> System.out.println("Hey its almost weekend");
            case SAT -> System.out.println("Enjoy your Saturday");
            default -> System.out.println(day.name().charAt(0)+day.name().substring(1).toLowerCase()+"day"+" is a Day "+dayInWeek);
        }
    }

    public static DaysOfTheWeek getRandomDay(){
        int randomInt = new Random().nextInt(7);
        var days = DaysOfTheWeek.values();
        return days[randomInt];
    }



}
