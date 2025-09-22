public abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String number, String type, double rate) {
        this.vehicleNumber = number; this.type = type; this.rentalRate = rate;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
}
