package com.library.entity;

public record Book(String title, String author, double price, String isbn) {

    public Book {
        if(title == null || title.isBlank()){
            throw new IllegalArgumentException("Title cannot be empty");
        }
        if(isbn.length() != 13){
            throw new IllegalArgumentException("ISBN must be 13 characters");
        }
    }
}
