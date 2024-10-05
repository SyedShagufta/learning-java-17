package com.basics.challenges;

public class PrimeNumberChallenge {

    public static void main(String[] args) {
        int counter=0;
       for(int i=0; counter < 3 && i<=10; i++)
       {
           if(isPrime(i)){
               System.out.println(i);
               counter++;
               System.out.println(counter);
           }
       }

    }

    public static boolean isPrime(int num)
    {
        if(num < 2){
            return false;
        }

        for(int divisor = 2; divisor <= num/2 ; divisor++)
        {
            if(num % divisor == 0){
                return false;
            }
        }

        return true;

    }

}
