package com.basics.challenges;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0, sum=0;
        do{
            System.out.println("Enter number #"+(i+1));
            String number = scanner.nextLine();

            try {
                int parsedNumber = Integer.parseInt(number);
                if(parsedNumber <=0 ){
                    System.out.println("Enter positive numbers only");
                    continue;
                }
                sum+=parsedNumber;
                i++;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid number, please enter integer value!");
            }

        }while(i<5);

        System.out.println(sum);

    }



}
