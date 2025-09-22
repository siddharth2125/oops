class Vehicle {
    int maxSpeed; String fuelType;
    Vehicle(int s,String f){ maxSpeed=s; fuelType=f; }
    void displayInfo(){ System.out.println("Speed:"+maxSpeed+" Fuel:"+fuelType); }
}

class Car extends Vehicle {
    int seats;
    Car(int s,String f,int se){ super(s,f); seats=se; }
    @Override void displayInfo(){ super.displayInfo(); System.out.println("Seats:"+seats); }
}

class Truck extends Vehicle {
    int load;
    Truck(int s,String f,int l){ super(s,f); load=l; }
    @Override void displayInfo(){ super.displayInfo(); System.out.println("Load:"+load); }
}

class Motorcycle extends Vehicle {
    boolean carrier;
    Motorcycle(int s,String f,boolean c){ super(s,f); carrier=c; }
    @Override void displayInfo(){ super.displayInfo(); System.out.println("Carrier:"+carrier); }
}

public class VehicleDemo {
    public static void main(String[] args){
        Vehicle[] v = {
            new Car(180,"Petrol",5),
            new Truck(120,"Diesel",10000),
            new Motorcycle(150,"Petrol",true)
        };
        for(Vehicle x:v) x.displayInfo();
    }
}
