package com.basics.challenges;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(2500));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));

    }

    public static String getDurationString(int seconds)
    {
        if(seconds < 0){
            return "Invalid seconds";
        }
        else{
            return getDurationString(seconds/60, seconds%60);
        }

    }

    public static String getDurationString(int minutes, int seconds)
    {
        if(minutes < 0 || (seconds < 0 || seconds >= 60 ))
        {
            return "Invalid Value";
        }
        else{
            int totalSecs = (minutes * 60 ) + seconds;
            int hours = totalSecs / 3600;
            int mins = (totalSecs % 3600) /60;
            int secs = totalSecs % 60;
            return hours+"h "+mins+"m "+secs+"s";

        }

    }

}
