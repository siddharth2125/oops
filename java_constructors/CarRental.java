package com.bridgelabz.oops.practice;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double RATE_PER_DAY = 1000.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    private double calculateCost() {
        return rentalDays * RATE_PER_DAY;
    }

    public void display() {
        System.out.println("Rental: " + customerName + " | Car: " + carModel + " | Days: " + rentalDays + " | Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental("Skand", "SUV", 5);
        r1.display();
    }
}
