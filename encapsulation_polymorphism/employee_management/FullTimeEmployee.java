public class FullTimeEmployee extends Employee {
    private double fixedAllowance;

    public FullTimeEmployee(String id, String name, double base, double allowance) {
        super(id, name, base);
        this.fixedAllowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedAllowance;
    }

    public double getFixedAllowance() { return fixedAllowance; }
    public void setFixedAllowance(double a) { this.fixedAllowance = a; }
}
