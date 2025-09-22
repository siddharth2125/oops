public abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String id, String driver, double rate) { this.vehicleId=id; this.driverName=driver; this.ratePerKm=rate; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println(driverName + " (" + vehicleId + ") - rate/km: " + ratePerKm);
    }

    public double getRatePerKm() { return ratePerKm; }
}
