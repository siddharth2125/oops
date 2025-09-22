package com.bridgelabz.oops.objectmodel;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("City Library");

        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2); // aggregation: book exists independently

        lib1.showBooks();
        lib2.showBooks();
    }
}
