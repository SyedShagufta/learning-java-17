package com.learning.challenges;

import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {


    public static ArrayList<String> myList= new ArrayList<>();

    public static void main(String[] args) {

        boolean isOn = true;
        Scanner sc = new Scanner(System.in);
        while(isOn)
        {
            System.out.println("Available Actions : ");
            System.out.println("=======".repeat(30));
            System.out.println("0 - to Shutdown");
            System.out.println("1 - to add the item(s) to list (comma delimited list) ");
            System.out.println("2 - to remove the item(s) from the list (comma delimited) ");
            System.out.println("Enter a number for which action you want to do : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0 -> isOn=false;
                case 1 -> {
                    String items = sc.nextLine();
                    addItems(items.split(","));
                    printItems();
                }
                case 2 -> {
                    String items = sc.nextLine();
                    removeItems(items.split(","));
                    printItems();
                }
                default -> System.out.println("Please enter a valid input");
            }
        }

    }

    public static void addItems(String... items)
    {
        for(var item: items){
            item = item.trim();
            if(!(myList.contains(item)) ) {
                myList.add(item);
            }
        }
    }

    public static void removeItems(String... items)
    {
        for(var item: items){
            myList.remove(item.trim());
        }
    }

    public static void printItems()
    {
        myList.sort(Comparator.naturalOrder());
        System.out.println(myList);
    }



}
