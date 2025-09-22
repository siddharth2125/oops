package com.bridgelabz.oops.objectmodel;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Employee: " + name + " | ID: " + id);
    }
}
