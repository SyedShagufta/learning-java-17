package com.learning.examples;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] array2 = new int[4][4];

        System.out.println(Arrays.toString(array2));

        for(int[] outer : array2)
        {
            System.out.println(Arrays.toString(outer));
        }

        for(var outer: array2)
        {
            for(var ele: outer)
            {
                System.out.print(ele+" ");
            }
            System.out.println();
        }


        for(int i=0; i<array2.length; i++)
        {
            var innerArray = array2[i];
            for(int j=0; j<innerArray.length; j++)
            {
                array2[i][j] = (i * 10) + (j + 1);
            }
        }

        System.out.println(Arrays.deepToString(array2));

    }

}
