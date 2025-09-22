public class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days * 2; }
    @Override public double calculateInsurance() { return 1500; }
    @Override public String getInsuranceDetails() { return "Truck commercial insurance"; }
}
