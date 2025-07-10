package com.learning.practice;

import java.util.*;

public class AddingGroceries {

    private static Scanner sc= new Scanner(System.in);
    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {
        String menu = """
                Available actions:
                
                0 - to shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                3 - to print items in Ascending order
                
                Enter a number for which action you want to do:""";
        boolean flag = true;
        while (flag){
            System.out.print(menu);
            System.out.print(" ");
            switch (sc.nextLine()){
                case "1" -> addItems();
                case "2" -> removeItems();
                case "3" -> printItemsInAscendingOrder();
                default -> flag=false;
            }
        }
    }

    public static void addItems(){
        System.out.println("Add the grocery items separated by ',' ");
        String input = sc.nextLine();
        String[] grocery = input.split(",");
        for(String g: grocery){
            if(!groceryList.contains(g.trim())){
                groceryList.add(g.trim().toLowerCase());
            }
        }
//        groceryList.addAll(List.of(grocery));
        printItemsInAscendingOrder();
    }

    public static void removeItems(){
        System.out.println("Type the grocery items you want to remove separated by ',' ");
        String input = sc.nextLine();
        String[] grocery = input.split(",");
        for (int i = 0; i < grocery.length; i++) {
            grocery[i] = grocery[i].trim().toLowerCase();
        }
        groceryList.removeAll(List.of(grocery));
        printItemsInAscendingOrder();
    }

    public static void printItemsInAscendingOrder(){
        System.out.println("=======".repeat(45));
        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);
        System.out.println("=======".repeat(45));
    }


}
