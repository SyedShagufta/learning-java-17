package com.learning.practice;

import java.util.LinkedList;

public class LinkedListMethods {


    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        addListMethods(placesToVisit);
        addLinkedListMethods(placesToVisit);
        addQueueMethods(placesToVisit);
        addStackMethods(placesToVisit);
        removeListMethods(placesToVisit);
        removeLinkedListMethods(placesToVisit);
        addListMethods(placesToVisit);
        removeQueueMethods(placesToVisit);
        removeStackMethods(placesToVisit);

    }

    public static void addListMethods(LinkedList<String> list){
        System.out.println("LIST 'ADD' METHODS WHICH ARE COMMON");
        System.out.println("==========".repeat(10));
        System.out.println("LIST -> "+list);
        System.out.println("list.add() method -> list.add('New York')");
        list.add("New york");
        System.out.println(list);
        System.out.println("list.add() method -> list.add(0, 'Paris')");
        list.add(0, "Paris");
        System.out.println(list);
        System.out.println("==========".repeat(10));
    }

    public static void addLinkedListMethods(LinkedList<String> list){
        System.out.println("LINKED LIST 'ADD' METHODS");
        System.out.println("==========".repeat(10));
        System.out.println("LIST -> "+list);
        System.out.println("list.addFirst() method -> list.addFirst('Brisbane')");
        list.addFirst("Brisbane");
        System.out.println(list);
        System.out.println("list.addLast() method -> list.addLast('Bali')");
        list.addLast("Bali");
        System.out.println(list);
        System.out.println("==========".repeat(10));
    }

    public static void addQueueMethods(LinkedList<String> list){
        System.out.println("Double ended QUEUE 'ADD' Methods using linked list");
        System.out.println("==========".repeat(10));
        System.out.println("LIST -> "+list);
        System.out.println("list.offer() method -> list.offer(\"Delhi\")");
        list.offer("Delhi");
        System.out.println(list);
        System.out.println("list.offerFirst() method -> list.offerFirst(\"Dubai\");");
        list.offerFirst("Dubai");
        System.out.println(list);
        System.out.println("list.offerLast() method -> list.offerLast(\"Saudi\");");
        list.offerLast("Saudi");
        System.out.println(list);
        System.out.println("==========".repeat(10));
    }

    public static void addStackMethods(LinkedList<String> list){
        System.out.println("Double ended STACK 'ADD' Methods using linked list");
        System.out.println("==========".repeat(10));
        System.out.println("LIST -> "+list);
        System.out.println("list.push() method -> list.push(\"Himalayas\");");
        list.push("Himalayas");
        System.out.println(list);
        System.out.println("==========".repeat(10));
    }

    public static void removeListMethods(LinkedList<String> list){
        System.out.println("List 'REMOVE' Methods: ");
        System.out.println("==========".repeat(10));
        System.out.println("LIST -> "+list);
        System.out.println("list.remove() method -> list.remove(\"Himalayas\");");
        list.remove("Himalayas");
        System.out.println(list);
        System.out.println("list.remove(int index) -> list.remove(1);");
        String s1 = list.remove(1);
        System.out.println(s1+" is removed");
        System.out.println(list);
        System.out.println("==========".repeat(10));
    }

    public static void removeLinkedListMethods(LinkedList<String> list){
        System.out.println("LinkedList 'REMOVE' Methods");
        System.out.println("==========".repeat(10));
        System.out.println("LIST -> "+list);
        System.out.println("list.remove() method -> removes first element");
        String s1 = list.remove();
        System.out.println(s1+" is removed");
        System.out.println(list);
        System.out.println("list.removeFirst() method -> removes first element");
        String s2 = list.removeFirst();
        System.out.println(s2+" is removed");
        System.out.println(list);
        System.out.println("list.removeLast() method -> removes last element");
        String s3 = list.removeLast();
        System.out.println(s3+" is removed");
        System.out.println(list);
        System.out.println("==========".repeat(10));
    }

    public static void removeQueueMethods(LinkedList<String> list){
        System.out.println("Double ended Queue 'REMOVE' Methods");
        System.out.println("==========".repeat(10));
        System.out.println("LIST -> "+list);
        System.out.println("list.poll() method -> removes the first element");
        list.poll();
        System.out.println(list);
        System.out.println("list.pollFirst() method -> removes the First element");
        list.pollFirst();
        System.out.println(list);
        System.out.println("list.pollLast() method -> removes the last element");
        list.pollLast();
        System.out.println(list);
        System.out.println("==========".repeat(10));
    }

    public static void removeStackMethods(LinkedList<String> list){
        System.out.println("Stack 'REMOVE' Methods");
        System.out.println("==========".repeat(10));
        System.out.println("LIST -> "+list);
        System.out.println("list.pop() method -> removes the first element");
        String s1 = list.pop();
        System.out.println(s1+" is removed");
        System.out.println(list);
        System.out.println("==========".repeat(10));
    }

}
