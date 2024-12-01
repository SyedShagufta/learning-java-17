package com.learning.examples;

import java.util.LinkedList;

public class RetrievingElements {

    public static void main(String[] args) {

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("paris");
        placesToVisit.add("switzerland");
        placesToVisit.add("Nepal");
        placesToVisit.add("kashmir");
        System.out.println(placesToVisit);

        System.out.println("Retrieved Element = "+placesToVisit.get(2));

        System.out.println("Get the first element = "+placesToVisit.getFirst());

        System.out.println("Get the Last element = "+placesToVisit.getLast());

        System.out.println("Retrieving using stack operations");

        System.out.println("Element from peek = "+placesToVisit.peek());
        System.out.println("First element from peekFirst = "+placesToVisit.peekFirst());
        System.out.println("Last element from peekLast = "+placesToVisit.peekLast());

        System.out.println(placesToVisit);
        System.out.println("Retrieving using element() from Queue operations = "+placesToVisit.element());
        System.out.println("index of element nepal = "+placesToVisit.indexOf("Nepal"));


    }

}
