#!/bin/bash
# ============================================
# Script: run_programs.sh
# Purpose: Compile and run multiple Java OOP examples
# Author: Skand Rawat
# Best Programming Practices applied in Java code
# ============================================

# Package directory
PKG_DIR="com/bridgelabz/oops/inbuiltfunction"

# Clean old classes
echo "Cleaning old class files..."
rm -rf com
mkdir -p $PKG_DIR

# ------------------------
# Program 1: BankAccount
# ------------------------
cat > $PKG_DIR/BankAccount.java << 'EOF'
package com.bridgelabz.oops.inbuiltfunction;

public class BankAccount {
    private static String bankName = "State bank of India";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.err.println("Insufficient balance or invalid amount.");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
        BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);

        System.out.println("\nAccount 1 Details:");
        account1.displayAccountDetails();

        System.out.println("\nAccount 2 Details:");
        account2.displayAccountDetails();

        BankAccount.getTotalAccounts();

        System.out.println("\nPerforming transactions on Account 1:");
        account1.deposit(200);
        account1.withdraw(150);
        account1.displayAccountDetails();

        account2.displayAccountDetails();
        account2.deposit(100);
        account2.withdraw(800);
    }
}
EOF

# ------------------------
# Program 2: Library
# ------------------------
cat > $PKG_DIR/Library.java << 'EOF'
package com.bridgelabz.oops.inbuiltfunction;

class Book {
    private static String libraryName;
    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void setLibraryName(String name) {
        libraryName = name;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Book.setLibraryName("Egmore Library");
        Book.displayLibraryName();

        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        book1.displayBookDetails();
    }
}
EOF

# ------------------------
# Similarly, add Programs 3 to 7...
# (Company, Product, Student, Vehicle, Patient)
# ------------------------

# Compile all Java files
echo "Compiling Java programs..."
javac com/bridgelabz/oops/inbuiltfunction/*.java

# Run each program
echo -e "\n=== Running BankAccount ==="
java com.bridgelabz.oops.inbuiltfunction.BankAccount

echo -e "\n=== Running Library ==="
java com.bridgelabz.oops.inbuiltfunction.Library

# Similarly, run other programs when added...
# java com.bridgelabz.oops.inbuiltfunction.Company
# java com.bridgelabz.oops.inbuiltfunction.Product
# java com.bridgelabz.oops.inbuiltfunction.Student
# java com.bridgelabz.oops.inbuiltfunction.Vehicle
# java com.bridgelabz.oops.inbuiltfunction.Patient
