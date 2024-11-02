package com.learning.challenges;

import java.util.Arrays;
import java.util.Random;

public class SortArray {

    public static void main(String[] args) {

        int[] unSortedArray = getRandomNumber(5);
        System.out.println("Unsorted Array");
        System.out.println("==============================");
        System.out.println(Arrays.toString(unSortedArray));
        System.out.println("Sorted Array");
        System.out.println("==============================");
        System.out.println(Arrays.toString(sortArray(unSortedArray)));

    }

    public static int[] getRandomNumber(int len)
    {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i=0; i<len;i++)
        {
            arr[i] = random.nextInt(1000);
        }

        return arr;
    }

    public static int[] sortArray(int[] array)
    {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;

        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

}
