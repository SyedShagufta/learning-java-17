package com.learning.iterator;

import java.util.LinkedList;

public class IteratorExample {

    public static void main(String[] args) {

        LinkedList<String> myList = new LinkedList<>();
        myList.add("Apple");
        myList.add("Mango");
        myList.addLast("Apple");
        myList.add("Banana");
        myList.add("Pear");
        printUsingIterator(myList);
        removeDuplicatesAndPrint(myList);
    }

    public static void removeDuplicatesAndPrint(LinkedList<String> list)
    {
        var iterator = list.iterator();
        while(iterator.hasNext())
        {
            if(iterator.next().equals("Apple")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
    public static void printUsingIterator(LinkedList<String> list)
    {
        var iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println(list);
    }

}
