package com.bridgelabz.oops.objectmodel;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Book: " + title + " | Author: " + author);
    }

    public String getTitle() { return title; }
}
