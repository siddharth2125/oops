package com.bridgelabz.oops.objectmodel;

import java.util.ArrayList;

public class Department {
    private String deptName;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void addEmployee(String name, int id) {
        employees.add(new Employee(name, id));
    }

    public void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}
