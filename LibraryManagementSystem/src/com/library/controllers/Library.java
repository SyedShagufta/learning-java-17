package com.library.controllers;

import com.library.entity.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private String libraryName;
    private static int totalBooksAdded;
    private Map<String, Integer> stockCount;
    private List<Book> inventory;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.stockCount = new HashMap<>();
        this.inventory = new ArrayList<>();
    }

    // ******************************************
    // Book Management
    // ******************************************

    // Adding a book
    public void addBook(Book book)
    {
        // if the book is already in the inventory increase the quantity
        if(inventory.contains(book)){
            stockCount.merge(book.title(), 1, Integer::sum);
            System.out.printf("A copy of the book %s added successfully !!%n",book.title());
        }
        else{
            // add the book to the inventory
            inventory.add(book);
            // First time adding this title -> set count to 1
            stockCount.put(book.title(), 1);
            System.out.printf("Book %s added successfully !!%n",book.title());
        }
        totalBooksAdded++;
    }

    // Overloading Concept
    // Adding multiple copies of movies
    public void addBook(Book book, int quantity)
    {
        // if the book is already in the inventory then increase the quantity
        if(inventory.contains(book)){
            stockCount.merge(book.title(), quantity, Integer::sum);
        }
        else{
            // add the book to the inventory
            inventory.add(book);
            // First time adding this title and copies of books
            stockCount.put(book.title(), quantity);
        }
    }

    // Book Exists using ISBN
    public boolean bookExists(String isbn)
    {
        for(Book book: inventory)
        {
            if(book.isbn().equals(isbn)){
                return true;
            }
        }
        return false;
    }

    // Remove Book  by ISBN and let's try to overload
    public void removeBook(String isbn)
    {
        removeBook(isbn, 1);
    }

    // Remove Book by ISBN and Quantity
    public void removeBook(String isbn, int quantity)
    {
        // If book exists remove book
        if(bookExists(isbn)){
            // get the book title based on isbn
            Book book = searchByISBN(isbn);
            String title = book.title();
            // removing the given copies of the book
            stockCount.put(title, stockCount.get(title)-quantity);
            System.out.printf("Removed %d copy/copies of %s successfully !!%n",quantity, title);
        }
        else{
            System.out.printf("No book found matching the ISBN - %s%n",isbn);
        }
    }


    // ********************************************
    // Searching and Retrieval
    // ********************************************

    // Search by Title - searchByTitle(String title) - returns Matching books
    public List<Book> searchByTitle(String title)
    {
        // Create a list of books that match the author
        List<Book> booksMatchByTitle = new ArrayList<>();
        // searching the inventory
        for(Book book: inventory)
        {
            if(book.title().equalsIgnoreCase(title) || book.title().toLowerCase().contains(title.toLowerCase())){
               booksMatchByTitle.add(book);
            }
        }
        return booksMatchByTitle;
    }

    // Search by Author
    public List<Book> searchByAuthor(String author)
    {
        // Create a list of books that match the author
        List<Book> booksMatchByAuthor = new ArrayList<>();
        // searching the inventory
        for(Book book: inventory)
        {
            if(book.author().equalsIgnoreCase(author) || book.author().toLowerCase().contains(author.toLowerCase())){
                booksMatchByAuthor.add(book);
            }
        }
        return booksMatchByAuthor;
    }

    // Search by ISBN
    public Book searchByISBN(String isbn)
    {
        // Create a list of books that match the isbn
        // searching the inventory
        for(Book book: inventory)
        {
            if(book.isbn().equals(isbn)){
               return book;
            }
        }
        return null;
    }

    // Show the entire inventory
    public void listAllBooks()
    {
        int i=1;
        int count=1;
            for(Book b: inventory) {
                System.out.println("---------------------------------");
                if(stockCount.containsKey(b.title())){
                    count = (int)stockCount.get(b.title());
                }
                System.out.printf("%d.  Title: %.30s%n    Author: %.30s%n    ISBN: %.30s%n    Stock: %d%n",
                        i, b.title(), b.author(),b.isbn(), count);
                i++;
                System.out.println("---------------------------------");
            }

    }

    // ********************************************
    // Borrowing / Returning
    // ********************************************

    public void borrowBook(String isbn)
    {
        Book book = searchByISBN(isbn);
        if(checkAvailability(isbn)){
            // removing from one copy of the book
            stockCount.put(book.title(), stockCount.get(book.title())-1);
            System.out.printf("You have successfully borrowed the book %s%n",
                    book.title());
        }
        else{
            System.out.printf("Sorry, The book %s is not available at the moment%n"
            , book.title());
        }
    }

    public void returnBook(String isbn)
    {
        Book book = searchByISBN(isbn);
        if(book!=null) {
            stockCount.put(book.title(), stockCount.get(book.title()) + 1);
            System.out.printf("The book %s returned successfully !!%n",book.title());
        }else{
            System.out.println("There was some issue with returning the book");
        }
    }

    public boolean checkAvailability(String isbn)
    {
        // First search for the book using isbn
        return searchByISBN(isbn) != null;
    }

    // ******************************************
    // Statistics & Utility
    // ******************************************

    public int getTotalBookCount(){
        int totalcount=0;
        for(int count: stockCount.values()){
            totalcount+=count;
        }
        return totalcount;
    }

    public int getUniqueBookCount(){
        return stockCount.size();
    }

    public void printInventoryReport(){
        System.out.println("-------------------------------------");
        System.out.println("========= Inventory Report ========= ");
        System.out.println("-------------------------------------");
        System.out.println("Total Unique Titles: "+getUniqueBookCount());
        System.out.println("Total Copies: "+getTotalBookCount());
        listAllBooks();
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", stockCount=" + stockCount +
                ", inventory=" + inventory +
                '}';
    }

    // getters and setters

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public static int getTotalBooksAdded() {
        return totalBooksAdded;
    }

    public static void setTotalBooksAdded(int totalBooksAdded) {
        Library.totalBooksAdded = totalBooksAdded;
    }

    public Map<String, Integer> getStockCount() {
        return stockCount;
    }

    public void setStockCount(Map<String, Integer> stockCount) {
        this.stockCount = stockCount;
    }

    public List<Book> getInventory() {
        return inventory;
    }

    public void setInventory(List<Book> inventory) {
        this.inventory = inventory;
    }
}
