package com.learning.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> groceries = new ArrayList<>();

        groceries.add("eggs");
        groceries.add("apples");

        System.out.println(groceries.get(1));

        System.out.println("Contains apples = "+groceries.contains("apples"));

        groceries.add("yogurt");
        groceries.add("eggs");

        System.out.println(groceries);

        System.out.println("Yogurt is at the index = "+ groceries.indexOf("yogurt"));

        System.out.println("First Index of eggs = "+groceries.indexOf("eggs"));

        System.out.println("Last Index of eggs = "+groceries.lastIndexOf("eggs"));

        // let's remove the eggs

        groceries.addAll(List.of("apples", "oranges", "mangoes"));
        groceries.addAll(Arrays.asList("pickles", "mustard"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));




    }

}
