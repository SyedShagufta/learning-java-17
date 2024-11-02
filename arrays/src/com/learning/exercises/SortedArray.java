package com.learning.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size)
    {
        Scanner sc = new Scanner(System.in);
        int[] myArr = new int[size];

        for(int i=0;i<size;i++)
        {
         myArr[i] = sc.nextInt();
        }

        sc.close();

        return myArr;
    }

    public static int[] sortIntegers(int[] unsortedArray)
    {
        for(int i=0;i<unsortedArray.length-1;i++)
        {
            for(int j=0;j<unsortedArray.length-i-1;j++) {
                if (unsortedArray[j] < unsortedArray[j+1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = temp;
                }
            }
        }

        return unsortedArray;

    }

    public static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("Element %d contents %d%n", i, arr[i]);
        }
    }

    public static void main(String[] args) {
       printArray(sortIntegers(getIntegers(3)));
    }

}
