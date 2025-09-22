public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
            new Car("KA01-1234", 2000),
            new Bike("KA02-4321", 500),
            new Truck("KA03-9999", 4000)
        };

        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " " + v.getVehicleNumber() + " rental for 3 days: " + v.calculateRentalCost(3));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable)v;
                System.out.println("  Insurance: " + ins.calculateInsurance() + " (" + ins.getInsuranceDetails() + ")");
            }
        }
    }
}
