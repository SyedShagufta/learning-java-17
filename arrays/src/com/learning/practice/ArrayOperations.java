package com.learning.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        // sort method
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        // filling
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 17);
        System.out.println(Arrays.toString(secondArray));

        // copying
        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i=0; i< len; i++){
            // returns random number from 0 to 99
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
