package com.bridgelabz.oops.practice;

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

class PostgraduateStudent extends Student {
    private String thesisTitle;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String thesisTitle) {
        super(rollNumber, name, cgpa);
        this.thesisTitle = thesisTitle;
    }

    public void display() {
        System.out.println("PG Student: " + name + " | Roll: " + rollNumber + " | Thesis: " + thesisTitle);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Riya", 8.5, "AI Research");
        pg.display();
        System.out.println("CGPA: " + pg.getCgpa());
    }
}
