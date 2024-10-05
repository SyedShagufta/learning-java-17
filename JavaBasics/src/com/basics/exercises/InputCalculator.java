package com.basics.exercises;

import java.util.Scanner;
public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage()
    {
        Scanner sc = new Scanner(System.in);
        int sum=0, count=0, avg = 0;
        while(true)
        {
            int userInput;
            try{
                userInput = Integer.parseInt(sc.nextLine());
                sum+=userInput;
                count++;
            }
            catch(NumberFormatException e){
                break;
            }
        }

        System.out.println("SUM = "+sum+" AVG = "+ Math.round((double) sum /count));

    }

}
