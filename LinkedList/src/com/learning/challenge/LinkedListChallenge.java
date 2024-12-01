package com.learning.challenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record Place(String town, int distance){
    @Override
    public String toString() {
        return String.format("%s (%s)", town, distance);
    }
}

public class LinkedListChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Place> placesToVisit = new LinkedList<>();
        addPlace(placesToVisit, new Place("Sydney", 0));
        addPlace(placesToVisit, new Place("Adelaide", 1374));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));
        addPlace(placesToVisit, new Place("Perth", 3923));
        String menu = """
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""";
        System.out.println(menu);
        boolean isContinue = true;
        boolean forward = true;
        ListIterator<Place> myItr = placesToVisit.listIterator();
        while (isContinue)
        {
            String choice = sc.nextLine().toUpperCase().substring(0, 1);


            if(!myItr.hasPrevious()){
                System.out.println("Originating from : "+myItr.next());
                forward = true;
            }

            if(!myItr.hasNext()){
                System.out.println("Final : "+myItr.previous());
                forward = false;
            }

            switch (choice){
                case "F" ->{
                    System.out.println("Moving forward");

                    if(!forward){
                        forward = true;
                        if(myItr.hasNext()) {
                            myItr.next();
                        }
                    }

                    if(myItr.hasNext()){
                        System.out.println(myItr.next());
                    }
                }

                case "B" -> {
                    System.out.println("Moving backward");
                    if(forward){
                        forward = false;
                        if(myItr.hasPrevious()) {
                            myItr.previous();
                        }
                    }

                    if(myItr.hasPrevious()){
                        System.out.println(myItr.previous());
                    }

                }

                case "L" -> {
                    System.out.println(placesToVisit);
                }

                case "M" -> {
                    System.out.println(menu);
                }

                default -> {
                    isContinue = false;
                }

            }
        }


    }

    public static void addPlace(LinkedList<Place> placesToVisit, Place place){

        if(placesToVisit.contains(place)){
            System.out.println("Duplicate : "+place);
            return;
        }

        for(Place p: placesToVisit){
            if(p.town().equalsIgnoreCase(place.town())){
                System.out.println("Duplicate : "+place);
                return;
            }
        }

        int index = 0;
        for(Place p: placesToVisit){
            if(place.distance() < p.distance()){
                placesToVisit.add(index, place);
                return;
            }
            index++;
        }

        placesToVisit.add(place);
    }
}
