package com.bridgelabz.oops.practice;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Person: " + name + " | Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 22);
        Person p2 = new Person(p1);
        p1.display();
        p2.display();
    }
}
