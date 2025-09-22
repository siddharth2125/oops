public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double base, int hours, double rate) {
        super(id, name, base);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + hoursWorked * hourlyRate;
    }

    public int getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(int h) { this.hoursWorked = h; }
}
