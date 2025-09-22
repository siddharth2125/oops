class Employee {
    String name; int id; double salary;
    Employee(String n,int i,double s){ name=n; id=i; salary=s; }
    void displayDetails(){ System.out.println(name+" | "+id+" | "+salary); }
}

class Manager extends Employee {
    int teamSize;
    Manager(String n,int i,double s,int t){ super(n,i,s); teamSize=t; }
    @Override void displayDetails(){ super.displayDetails(); System.out.println("Team: "+teamSize); }
}

class Developer extends Employee {
    String language;
    Developer(String n,int i,double s,String l){ super(n,i,s); language=l; }
    @Override void displayDetails(){ super.displayDetails(); System.out.println("Lang: "+language); }
}

class Intern extends Employee {
    String college;
    Intern(String n,int i,double s,String c){ super(n,i,s); college=c; }
    @Override void displayDetails(){ super.displayDetails(); System.out.println("College: "+college); }
}

public class EmployeeDemo {
    public static void main(String[] args){
        Employee e1 = new Manager("Alice",1,90000,5);
        Employee e2 = new Developer("Bob",2,60000,"Java");
        Employee e3 = new Intern("Charlie",3,20000,"IIT");
        e1.displayDetails(); e2.displayDetails(); e3.displayDetails();
    }
}
