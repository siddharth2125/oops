package com.bridgelabz.oops.practice;

public class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Default constructor
    public Book() {
        this("Unknown", "Unknown", 0.0, true);
    }

    // Parameterized constructor
    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Borrow a book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void display() {
        System.out.println("Book: " + title + " | Author: " + author + " | Price: " + price + " | Available: " + available);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James Gosling", 499.99, true);
        b1.display();
        b2.display();
        b2.borrowBook();
        b2.display();
    }
}
