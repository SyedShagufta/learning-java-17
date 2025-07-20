package com.learning.practice;

import java.util.Arrays;

public class TwoDArrayBasics {

    // Multi dimensional array - 2D Array
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(arr));
        for(int[] innerArr: arr){
                System.out.println(Arrays.toString(innerArr));
        }
        System.out.println(arr.length);

        for (var ele: arr){
            System.out.println(Arrays.toString(ele));
        }

        for (int i=0; i<arr.length;i++){
            var innerArr = arr[i];
            for (int j=0;j<innerArr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(var outer: arr){
            for(var inner: outer){
                System.out.print(inner+" ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr));
    }

}
