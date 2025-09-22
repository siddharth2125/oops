public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
            new Car("V1", "Rohit", 15),
            new Bike("V2", "Sunil", 8),
            new Auto("V3", "Kumar", 10)
        };

        double distance = 12.5;
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("  Fare for " + distance + " km: " + v.calculateFare(distance));
            if (v instanceof GPS) {
                GPS gps = (GPS)v;
                gps.updateLocation("MG Road");
                System.out.println("  Location: " + gps.getCurrentLocation());
            }
        }
    }
}
