package com.basics.exercises;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 19, 999));
        System.out.println(isValid(9));
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3)
    {
        if(!isValid(n1) || !isValid(n2) || !isValid(n3))
        {
            return false;
        }

        int firstNumLastDigit = n1%10;
        int secondNumLastDigit = n2%10;
        int thirdNumberLastDigit = n3%10;

        return(firstNumLastDigit == secondNumLastDigit || firstNumLastDigit == thirdNumberLastDigit || secondNumLastDigit == thirdNumberLastDigit);


    }

    public static boolean isValid(int num)
    {

        return (num >= 10 && num <= 1000);
    }

}