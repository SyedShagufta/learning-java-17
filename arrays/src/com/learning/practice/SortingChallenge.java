package com.learning.practice;

import java.util.Arrays;
import java.util.Random;

public class SortingChallenge {
    public static void main(String[] args) {

        int[] arr = getRandomArray(10);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortArrayInDesc(arr)));

    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newArr = new int[len];

        for(int i=0; i<len; i++){
            newArr[i] = random.nextInt(1, 10);
        }

        return newArr;
    }

    public static int[] sortArrayInDesc(int[] arr){
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArr);
        int[] sortedArr = new int[copyArr.length];
        int tmp=0;
        for(int i=copyArr.length-1; i>=0; i--){
            sortedArr[tmp] = copyArr[i];
            tmp++;
        }
        return sortedArr;
    }
}
