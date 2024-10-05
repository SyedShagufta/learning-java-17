package com.basics.exercises;


public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(1, 5));
        System.out.println(sumOdd(10, 10));
    }

    public static boolean isOdd(int num)
    {
        return (num > 0 && num%2 !=0);
    }

    public static int sumOdd(int start, int end)
    {

        if(start < 0 || end < 0 || start > end)
        {
            return -1;
        }

        int sum = 0;

        for(int i=start; i<=end; i++)
        {
            if(isOdd(i)){
                sum+=i;
            }
        }

        return sum;

    }



}
