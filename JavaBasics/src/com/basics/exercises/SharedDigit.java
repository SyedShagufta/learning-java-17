package com.basics.exercises;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int n1, int n2)
    {
        if(n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99)
        {
            return false;
        }
        return(n1%10 == n2%10 || n1%10 == n2/10 || n1/10 == n2%10 || n1/10 == n2/10);
    }

}