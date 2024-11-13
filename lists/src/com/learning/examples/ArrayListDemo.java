package com.learning.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record GroceryList(String name, String type, int count)
{
    GroceryList(String name)
    {
        this(name, "DAIRY", 1);
    }
}

public class ArrayListDemo {

    public static void main(String[] args) {

        GroceryList[] obj = new GroceryList[3];

        obj[0] = new GroceryList("Milk");
        obj[1] = new GroceryList("Mangoes", "FRUITS", 6);

        System.out.println(Arrays.toString(obj));

        // creating an array list
        ArrayList<GroceryList> myGroceryList = new ArrayList<>();

        myGroceryList.add(new GroceryList("Milk"));
        myGroceryList.add(new GroceryList("Oranges", "Fruits", 12));
        myGroceryList.add(1, new GroceryList("Onions", "Vegetables", 5));

        // adding mangoes at index 0
        myGroceryList.add(0, new GroceryList("Mangoes", "fruits", 6));
        //System.out.println(myGroceryList);

        // if I want to replace the mangoes with watermelon then i can use the set method
        myGroceryList.set(0, new GroceryList("Watermelon", "Fruits", 1));
        System.out.println(myGroceryList);

        // removing the milk from the grocery list
        myGroceryList.remove(1);
        System.out.println(myGroceryList);

        String[] items = {"apples", "bananas", "Milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");

        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("mustard", "pickles", "cheese")
        );

        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);


    }

}
