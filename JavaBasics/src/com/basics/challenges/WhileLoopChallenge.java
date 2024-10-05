package com.basics.challenges;

public class WhileLoopChallenge {

    public static void main(String[] args) {

        int j=5, count=0;
        while(j<=20)
        {
            if(isEvenNumber(j)){
                System.out.println(j+" is an even number.");
            }
            else{
                System.out.println(j+" is an odd number");
            }
            if(count >= 4){
                break;
            }
            count++;
            j++;

        }

    }

    public static boolean isEvenNumber(int number)
    {
        return number%2==0;
    }

}
