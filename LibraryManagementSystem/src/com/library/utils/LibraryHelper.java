package com.library.utils;

import com.library.controllers.Library;
import com.library.entity.Book;
import com.library.entity.Librarian;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryHelper {

    public static List<Library> libraryList = new ArrayList<>();

    private final Library selectedLibrary;

    public LibraryHelper() {
        this(new Library("Demo"));
    }

    public LibraryHelper(Library selectedLibrary) {
        this.selectedLibrary = selectedLibrary;
        libraryList.add(selectedLibrary);
    }

    Scanner sc = new Scanner(System.in);

    public void addBook()
    {
        System.out.println("==== Adding a book ====");
        System.out.println("Enter title: ");
        String title = sc.nextLine();
        System.out.println("Enter Author: ");
        String author = sc.nextLine();
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter ISBN Number(13 Digits): ");
        String isbn = sc.nextLine();
        Book book = new Book(title, author, price, isbn);
        selectedLibrary.addBook(book);
    }


    public void addBookMultipleCopies(){
        System.out.println("==== Adding a book ====");
        System.out.println("Enter title: ");
        String title = sc.nextLine();
        System.out.println("Enter Author: ");
        String author = sc.nextLine();
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter ISBN Number(13 Digits): ");
        String isbn = sc.nextLine();
        Book book = new Book(title, author, price, isbn);
        System.out.println("Select the number of copies you want to add(1 copy or 2 etc): ");
        int qty = sc.nextInt();
        sc.nextLine();
        selectedLibrary.addBook(book, qty);
    }

    public void removeBook()
    {
        System.out.println("==== Removing a book ====");
        System.out.println("Enter ISBN Number(13 Digits): ");
        String isbn = sc.nextLine();
        while(isbn.length() != 13){
            System.out.println("Enter Valid ISBN Number (13 Digits): ");
            isbn = sc.nextLine();
        }
        System.out.println("Enter the number of copies to remove: ");
        int qty = sc.nextInt();
        sc.nextLine();
        selectedLibrary.removeBook(isbn, qty);
    }

    public void searchBookByTitle()
    {
        System.out.println("==== Searching a book by Title ====");
        System.out.println("Enter the title to search: ");
        String title = sc.nextLine();
        List<Book> books = selectedLibrary.searchByTitle(title);
        System.out.printf("Title: %s%n ",title);
        if(books != null){
            System.out.println("Found: ");
            System.out.println("-----------");
            for(Book book: books){
                System.out.printf("Title: %s%n Author: %s%n Price: %.2f%n ISBN: %s%n", book.title(),book.author(),book.price(), book.isbn());
                System.out.println("-----------");
            }
        }else {
            System.out.println("Book Not Found ! Try another way");
        }
    }

    public void searchBookByAuthor()
    {
        System.out.println("==== Searching a book by Author ====");
        System.out.println("Enter the Author name to search: ");
        String author = sc.nextLine();
        List<Book> books = selectedLibrary.searchByAuthor(author);
        System.out.printf("Author: %s%n ",author);
        if(books != null){
            System.out.println("Found: ");
            System.out.println("-----------");
            for(Book book: books){
                System.out.printf("Title: %s%n Price: %.2f%n ISBN: %s%n", book.title(),book.price(), book.isbn());
                System.out.println("-----------");
            }
        }else {
            System.out.println("Book Not Found ! Try another way");
        }
    }

    public void searchByISBN(){
        System.out.println("==== Searching a book by ISBN ====");
        System.out.println("Enter the ISBN to search: ");
        String isbn = sc.nextLine();
        Book book = selectedLibrary.searchByISBN(isbn);
        System.out.printf("ISBN: %s%n ",isbn);
        if(book != null){
            System.out.println("Found: ");
            System.out.println("-----------");
            System.out.printf("Title: %s%n Price: %.2f%n Author: %s%n", book.title(),book.price(), book.author());
            System.out.println("-----------");
        }else {
            System.out.println("Book Not Found ! Try another way");
        }
    }

    public void borrowBook(){
        System.out.println("==== Borrowing a book ====");
        System.out.println("Enter the ISBN to borrow: ");
        String isbn = sc.nextLine();
        selectedLibrary.borrowBook(isbn);
    }

    public void returnBook(){
        System.out.println("==== Returning a book ====");
        System.out.println("Enter the ISBN to return: ");
        String isbn = sc.nextLine();
        selectedLibrary.returnBook(isbn);
    }

    public void printInventoryReport(){
        selectedLibrary.printInventoryReport();
    }

    public void listAllBooks()
    {
        selectedLibrary.listAllBooks();
    }

}
