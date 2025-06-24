package com.learning.practice;

import java.util.Arrays;

public class ArraysBasic {

    public static void main(String[] args) {

        // Declaring a simple array
        int[] arr1 = new int[10];
        arr1[0] = 15;
        arr1[1] = 12;
        arr1[5] = 56;

        // Initializing an array
        int[] fistFirstPositives = new int[]{1, 2, 3, 4, 5};
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrayLength = firstTen.length;
        System.out.println("Length of the array = "+arrayLength);
        System.out.println("last = "+ firstTen[arrayLength-1]);

        int[] newArray;
        // we cannot use the below
        newArray = new int[]{5, 4, 3, 2, 1};

        for(int i=0; i< newArray.length; i++){
            System.out.print(newArray[i]+" ");
        }

        // Enhanced For loop
        for(int ele: arr1){
            System.out.print(ele+" ");
        }

        System.out.println();
        // Try printing the array directly
        System.out.println(arr1);

        // now let's do the same using the static methods on Arrays class
        System.out.println(Arrays.toString(arr1));

    }

}
