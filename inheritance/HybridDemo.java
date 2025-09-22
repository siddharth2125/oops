interface Worker { void performDuties(); }

class Person { String name; int id; Person(String n,int i){ name=n; id=i; } }

class Chef extends Person implements Worker {
    Chef(String n,int i){ super(n,i); }
    public void performDuties(){ System.out.println(name+" cooks food."); }
}

class Waiter extends Person implements Worker {
    Waiter(String n,int i){ super(n,i); }
    public void performDuties(){ System.out.println(name+" serves food."); }
}

interface Refuelable { void refuel(); }

class Vehicle2 {
    int maxSpeed; String model;
    Vehicle2(int s,String m){ maxSpeed=s; model=m; }
}

class ElectricVehicle extends Vehicle2 {
    ElectricVehicle(int s,String m){ super(s,m); }
    void charge(){ System.out.println(model+" is charging..."); }
}

class PetrolVehicle extends Vehicle2 implements Refuelable {
    PetrolVehicle(int s,String m){ super(s,m); }
    public void refuel(){ System.out.println(model+" is refueling petrol..."); }
}

public class HybridDemo {
    public static void main(String[] args){
        Worker w1 = new Chef("Ravi",1);
        Worker w2 = new Waiter("Sita",2);
        w1.performDuties(); w2.performDuties();

        ElectricVehicle ev = new ElectricVehicle(200,"Tesla");
        PetrolVehicle pv = new PetrolVehicle(180,"Honda");
        ev.charge(); pv.refuel();
    }
}
