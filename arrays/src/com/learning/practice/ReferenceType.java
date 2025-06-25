package com.learning.practice;

import java.util.Arrays;

public class ReferenceType {

    public static void main(String[] args) {
        int[] myArray = new int[10];
        int[] anotherArray = myArray;

        System.out.println("myArray = "+ Arrays.toString(myArray));
        System.out.println("anotherArray = "+ Arrays.toString(anotherArray));

        myArray[0] = 1;
        modifyArray(myArray);

        System.out.println("after change myIntArray = "+Arrays.toString(myArray));
        System.out.println("after change anotherArray = "+Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[1] = 2;
    }

}
