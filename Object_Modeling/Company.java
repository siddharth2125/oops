package com.bridgelabz.oops.objectmodel;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Department> departments = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        Department dev = new Department("Development");
        dev.addEmployee("Alice", 101);
        dev.addEmployee("Bob", 102);

        Department hr = new Department("HR");
        hr.addEmployee("Charlie", 201);

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showCompany();
    }
}
