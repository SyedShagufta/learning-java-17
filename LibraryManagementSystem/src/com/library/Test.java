package com.library;

import com.library.controllers.Library;
import com.library.entity.Book;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        // Testing the add book methods - addBook(book) and addBook(book, qty)
        Library kluLibrary = new Library("KLU-Library");
        Book book1 = new Book("The Hobbit",
                "J.R.R. Tolkien",
                450,
                "9780547928227");
        kluLibrary.addBook(book1);
        Book book2 = new Book("Atomic Habits",
                "James Clear",
                380,
                "9780735211292");
        kluLibrary.addBook(book2, 4);
        Book book3 = new Book("The Hobbit",
                "J.R.R. Tolkien",
                450,
                "9780547928227");
        kluLibrary.addBook(book3);
        kluLibrary.listAllBooks();

        // Testing the removeBook(isbn)
        // Trying to remove one copy of the book - Atomic Habits
        kluLibrary.removeBook("9780735211292");
        kluLibrary.listAllBooks();

        // Testing the bookExists(String isbn) Method
        // The Hobbit Book
        System.out.println(kluLibrary.bookExists("9780547928227"));


        // Testing the Search by title
        /*Book AtomicHabits = kluLibrary.searchByTitle("Atomic Habits");
        System.out.println(AtomicHabits);*/

        // Testing the Search by ISBN
        Book TheHobbit = kluLibrary.searchByISBN("9780547928227");
        System.out.println(TheHobbit);

        // Testing the searchByAuthor
        // But first let's add two books with same author
        Book book4 = new Book(
                "Deep Work",
                "Cal Newport",
                580,
                "9780525536512"
        );
        kluLibrary.addBook(book4);
        Book book5 = new Book(
                "Digital Minimalism",
                "Cal Newport",
                520,
                "9780525536512"
        );
        kluLibrary.addBook(book5);

        // Now let's search
        List<Book> books = kluLibrary.searchByAuthor("Cal Newport");
        for(Book book: books){
            System.out.println(book);
        }

        // Testing the methods - borrowing and returning the book
        kluLibrary.borrowBook("9780525536512");
        kluLibrary.listAllBooks();
        kluLibrary.returnBook("9780525536512");
        kluLibrary.listAllBooks();

    }

}
