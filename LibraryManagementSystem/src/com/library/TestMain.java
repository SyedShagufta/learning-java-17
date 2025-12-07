package com.library;

import com.library.utils.LibraryHelper;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryHelper libraryHelper = new LibraryHelper();
        while (true) {
            printMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0 -> {
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
                case 11 -> {
                    System.out.println("Need to implement this (In Progress)");
                }
                default -> System.out.println("Invalid input! Please select a valid input");
            }
        }

    }

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
