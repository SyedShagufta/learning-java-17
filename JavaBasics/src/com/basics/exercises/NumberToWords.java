package com.basics.exercises;

public class NumberToWords {

    public static void main(String[] args) {
       numberToWord(123);
       numberToWord(1010); // 101 1 0 1
       numberToWord(1000);
       numberToWord(-12);
       numberToWord(0);

    }

    public static void numberToWord(int number)
    {

        int reverse = reverse(number);

        int numberOfZeros = Math.abs(getDigitCount(reverse)-getDigitCount(number));

        if(number==0)
        {
            System.out.println("Zero");
        }

        if(reverse < 0)
        {
            System.out.println("Invalid Value");
        }
        while(reverse!=0)
        {
            int digit = reverse%10;
            switch (digit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reverse=reverse/10;
        }
        if(numberOfZeros > 0)
        {
            for(int i=0;i<numberOfZeros;i++)
            {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number)
    {
        int rev=0;
        while(number!=0)
        {
            rev = rev*10 + number%10;
            number=number/10;
        }
        return rev;
    }

    public static int getDigitCount(int number)
    {
        if(number < 0){
            return -1;
        }
        if(number==0){
            return 1;
        }

        int count=0;
        while (number!=0)
        {
            int digit = number%10;
            count++;
            number=number/10;
        }

        return count;
    }
}
