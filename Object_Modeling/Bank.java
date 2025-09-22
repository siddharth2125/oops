package com.bridgelabz.oops.objectmodel;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(Customer customer) {
        customers.add(customer);
    }

    public void showCustomers() {
        System.out.println("Bank: " + bankName);
        for (Customer c : customers) {
            c.viewBalance();
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");
        Customer c1 = new Customer("Alice", 1000);
        Customer c2 = new Customer("Bob", 500);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.deposit(200);
        bank.showCustomers();
    }
}
