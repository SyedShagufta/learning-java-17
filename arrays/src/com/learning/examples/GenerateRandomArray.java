package com.learning.examples;

import java.util.Arrays;
import java.util.Random;

public class GenerateRandomArray {

    public static void main(String[] args) {

        int[] arr1 = getRandomArray(10);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[10];
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2, 5);
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(arr1));
        int[] arr3 = Arrays.copyOf(arr1, 15);
        System.out.println(Arrays.toString(arr3));

        // Binary search
        String[] sArr = new String[]{"Josh", "Ash", "Ryan", "William", "Sofia"};
        Arrays.sort(sArr);
        System.out.println(Arrays.toString(sArr));
        // returns the index of the element
        System.out.println(Arrays.binarySearch(sArr, "William"));

        int[] myarr1 = {1, 2, 3, 4, 5};
        int[] myarr2 = {5, 2, 3, 4, 1};

        if(Arrays.equals(myarr1, myarr2)){
            System.out.println("equal");
        }else {
            System.out.println("Not equal");
        }

    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] randomArray = new int[len];

        for(int i=0; i<len; i++){
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }

}
