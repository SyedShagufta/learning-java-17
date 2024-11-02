package com.learning.challenges;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println("Reversed array using this another method is = "+ Arrays.toString(anotherReverse(arr)));
    }

    private static void reverse(int[] array)
    {
        System.out.println("Array = "+ Arrays.toString(array));
        int len = array.length-1;
        for(int i=0; i< array.length/2; i++)
        {
            int temp = array[i];
            array[i] = array[len];
            array[len] = temp;
            len--;
        }

        System.out.println("Reversed array = "+Arrays.toString(array));

    }

    private static int[] anotherReverse(int[] array)
    {
        int[] reverseArray = new int[array.length];
        int maxIndex = array.length-1;
        for(int ele: array){
            reverseArray[maxIndex--] = ele;
        }

        return reverseArray;
    }

}
