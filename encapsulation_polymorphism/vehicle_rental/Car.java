public class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override public double calculateInsurance() { return 500; }
    @Override public String getInsuranceDetails() { return "Car insurance policy"; }
}
