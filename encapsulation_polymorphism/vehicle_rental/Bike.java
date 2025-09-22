public class Bike extends Vehicle {
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days * 0.6; }
}
