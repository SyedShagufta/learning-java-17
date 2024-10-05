package com.basics.challenges;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(-100));
        System.out.println(sumDigits(2));
    }

    public static int sumDigits(int number)
    {
        if(number < 0){
            return -1;
        }
        int sum=0;
        while(number !=0)
        {
            sum+=number%10;
            number=number/10;
        }
        return sum;
    }
}
