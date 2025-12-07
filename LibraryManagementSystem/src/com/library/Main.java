package com.library;

import com.library.controllers.Library;
import com.library.utils.LibraryHelper;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        while(true){
            System.out.println("""
                **************************************************************************
                ============== Welcome to Sofia's Library Management System ==============
                **************************************************************************
                Please select from the following
                1. Create a Library
                2. If Library exists choose your Library
                0. Exit the Main Menu
                Enter your choice""");
            int libraryChoice = sc.nextInt();
            sc.nextLine();
            switch (libraryChoice) {
                case 1 -> {
                    System.out.println("Greetings and thank you for your choice of creating a library");
                    System.out.println("Please pick your library name: ");
                    String libraryName = sc.nextLine();
                    boolean exists = true;
                    while (exists) {
                        exists=false;
                        for (Library library : LibraryHelper.libraryList) {
                            if (library.getLibraryName().equals(libraryName)) {
                                System.out.println("Library name already exists.. Please select another: ");
                                libraryName = sc.nextLine();
                                exists=true;
                                break;
                            }
                        }
                    }
                    LibraryHelper.libraryList.add(new Library(libraryName));
                    getMenuOptions(getLibraryByLibraryName(libraryName));
                }
                case 2 -> {
                    System.out.println("Please enter your Library name to proceed!");
                    String libraryName = sc.nextLine();
                    Library library = getLibraryByLibraryName(libraryName);
                    if (library != null) {
                        getMenuOptions(library);
                    } else {
                        System.out.println("No such Library exists !");
                    }
                }
                case 0 -> {
                    System.out.println("*********************************************************");
                    System.out.println("Thank you for choosing Sofia's Library Management System");
                    System.out.println("*********************************************************");
                    return;
                }
                default -> System.out.println("Please enter a valid option");
            }

        }
    }

    public static Library getLibraryByLibraryName(String libraryName) {
        Library result = null;
        for (Library lib : LibraryHelper.libraryList) {
            if (lib.getLibraryName().equalsIgnoreCase(libraryName)) {
                result = lib;
                break;
            }
        }
        return result;
    }

    // Getting the Menu Options
    public static void getMenuOptions(Library library) {
        LibraryHelper libraryHelper = new LibraryHelper(library);
        while (true) {
            printMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0, 11 -> {
                    return;
                }
                case 1 -> {
                    libraryHelper.addBook();
                }
                case 2 -> {
                    libraryHelper.addBookMultipleCopies();
                }
                case 3 -> {
                    libraryHelper.removeBook();
                }
                case 4 -> {
                    libraryHelper.searchBookByTitle();
                }
                case 5 -> {
                    libraryHelper.searchBookByAuthor();
                }
                case 6 -> {
                    libraryHelper.searchByISBN();
                }
                case 7 -> {
                    libraryHelper.borrowBook();
                }
                case 8 -> {
                    libraryHelper.returnBook();
                }
                case 9 -> {
                    libraryHelper.listAllBooks();
                }
                case 10 -> {
                    libraryHelper.printInventoryReport();
                }
                default -> System.out.println("Invalid input! Please select a valid input");
            }
        }

    }

    // printing the menu
    public static void printMenu()
    {
        System.out.println("""
                **************************************
                ====== Library Inventory System ======
                **************************************
                1. Add Book
                2. Add Multiple Copies
                3. Remove Book
                4. Search Book by Title
                5. Search Book by Author
                6. Search Book by ISBN
                7. Borrow Book
                8. Return Book
                9. List All Books
                10. Print Inventory Report
                11. Go back to main menu
                0. Exit
                Enter your choice:"""
        );
    }


}


