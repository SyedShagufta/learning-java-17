package com.learning.practice;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr)
    {
        int j = arr.length-1;
        for(int i=0; i<arr.length; i++){
            if(i>=j){
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            System.out.println("i value : "+i);
            System.out.println("j value : "+j);
            System.out.println(Arrays.toString(arr));
            j--;

        }

    }

}
