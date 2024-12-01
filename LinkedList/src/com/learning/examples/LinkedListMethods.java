package com.learning.examples;

import java.util.LinkedList;

public class LinkedListMethods {

    public static void main(String[] args) {


        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("paris");
        placesToVisit.add("switzerland");
        placesToVisit.add("Nepal");
        placesToVisit.add("kashmir");

        System.out.println(placesToVisit);
        System.out.println("called the add more places method");

        addMorePlaces(placesToVisit);

        System.out.println(placesToVisit);

//        System.out.println("Removing the elements");
//        removePlaces(placesToVisit);
//
//        removeFirstAndLast(placesToVisit);

        addQueueOperations(placesToVisit);
        removeQueueOperations(placesToVisit);

        stackOperations(placesToVisit);

        peekOperations(placesToVisit);

    }

    private static void addMorePlaces(LinkedList<String> list)
    {
        list.addFirst("America");
        list.addLast("Bhutan");
    }

    private static void removePlaces(LinkedList<String> list)
    {
        // remove using the index
        String removedElement = list.remove(4);
        System.out.println("Removed element "+removedElement);
        System.out.println(list);
        // remove using the object
        if(list.remove("Bhutan")){
            System.out.println("Removed Bhutan");
        }else{
            System.out.println("Not able to remove bhutan");
        }
        System.out.println(list);
    }

    private static void removeFirstAndLast(LinkedList<String> list)
    {
        System.out.println("removing first and last elements");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }

    private static void addQueueOperations(LinkedList<String> list)
    {
        list.offer("Shimla");
        list.offerFirst("Pune");
        list.offerLast("Mumbai");
        System.out.println(list);
    }

    private static void removeQueueOperations(LinkedList<String> list)
    {
        System.out.println("removing using poll");
        list.poll();
        System.out.println(list);
        System.out.println("removing using poll first");
        list.pollFirst();
        System.out.println(list);
        System.out.println("removing using poll last");
        list.pollLast();
        System.out.println(list);
    }

    private static void stackOperations(LinkedList<String> list)
    {
        System.out.println("Stack Operations - Push and Pop");
        System.out.println("Performing push");
        list.push("Egypt");
        System.out.println(list);
        System.out.println("performing pop");
        list.pop();
        System.out.println(list);
    }

    private static void peekOperations(LinkedList<String> list)
    {
        System.out.println("Peek operations - Peek, peekFirst and peekLast");
        System.out.println("Peek "+list.peek());
        System.out.println("Peek first "+list.peekFirst());
        System.out.println("Peek Last "+list.peekLast());

    }




}
