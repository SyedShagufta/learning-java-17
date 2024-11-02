package com.learning.examples;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        Object[] anyArray = new Object[3];

        System.out.println(Arrays.deepToString(anyArray));

        // creating a one-dimensional array as the first element in the object array
        anyArray[0] = new String[] {"1", "2", "3"};

        System.out.println(Arrays.deepToString(anyArray));

        // creating a two-dimensional array as the second element in the object array
        anyArray[1] = new String[][] {
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        System.out.println(Arrays.deepToString(anyArray));

        // creating a three-dimensional array as the third element in the object array
        anyArray[2] = new String[][][] {
                {
                        {"10", "11", "12"},
                        {"13", "14", "15"}
                },
                {
                        {"16", "17", "18"},
                        {"19", "20", "21"},
                        {"22", "23", "24"}
                }
        };

        System.out.println(Arrays.deepToString(anyArray));

        for (Object ele : anyArray) {
            System.out.println("The element type is " + ele.getClass().getSimpleName());
            System.out.println("The address type of the element " + ele);
            System.out.println("The element is " + Arrays.deepToString((Object[]) ele));
        }

    }

}
