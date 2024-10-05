package com.basics.exercises;

public class NumberPalindrome {
    // write code here
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(1441));
    }
    public static boolean isPalindrome(int number)
    {
        int n = Math.abs(number);
        StringBuilder reverse= new StringBuilder();
        while(n!=0)
        {
            int digit = n%10;
            reverse.append(digit);
            n=n/10;
        }

        return String.valueOf(Math.abs(number)).equals(reverse.toString());
    }
}