package com.basics.challenges;

import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int loopCount = 0;
        while(true) {
            int userInput;
            System.out.println("Enter any character to exit: ");
            try {
                userInput = Integer.parseInt(scanner.nextLine());
                if(loopCount == 0 || userInput > max){
                    max = userInput ;
                }
                if (loopCount == 0 || userInput < min) {
                    min = userInput;
                }
                loopCount++;
            } catch (NumberFormatException badInput) {
                break;
            }

        }
        if(loopCount == 0)
        {
            System.out.println("Invalid Data");
        }
        else {
            System.out.println("The minimum number is : " + min);
            System.out.println("The Maximum number is : " + max);
        }
    }
}
