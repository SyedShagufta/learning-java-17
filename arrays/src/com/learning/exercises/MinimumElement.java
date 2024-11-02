package com.learning.exercises;

import java.util.Scanner;
import java.util.Arrays;
public class MinimumElement {

    public static void main(String[] args) {

        System.out.println("Minimum Element is - "+ findMin(readElements(readInteger())));
    }
    private static int readInteger()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static int[] readElements(int l)
    {
        int[] arr = new int[l];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<l; i++)
        {
            arr[i] = sc.nextInt();
        }

        return arr;

    }

    private static int findMin(int[] arr)
    {
        Arrays.sort(arr);
        return arr[0];
    }

}