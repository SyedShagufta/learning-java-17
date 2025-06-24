package com.learning.practice;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {
        // Binary search
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        if(Arrays.binarySearch(sArray, "Mark")>0){
            System.out.println("Found mark in the list");
        }
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if(Arrays.equals(s1, s2)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Not equal");
        }

    }
}
