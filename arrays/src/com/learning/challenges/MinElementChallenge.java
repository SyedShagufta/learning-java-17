package com.learning.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] numList = readIntegers(s.split(","));

        System.out.println(Arrays.toString(numList));

        System.out.println("Min Value = "+findMin(numList));

    }

    private static int[] readIntegers(String... numList)
    {
        int[] intNumList = new int[numList.length];

        for(int i=0;i<numList.length;i++)
        {
            intNumList[i] = Integer.parseInt(numList[i]);
        }

        return intNumList;
    }

    private static int findMin(int[] arr)
    {
        int min = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;

    }

}
