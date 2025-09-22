package com.bridgelabz.oops.objectmodel;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println(name + "'s balance: $" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
