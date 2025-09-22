public class HRDepartment implements Department {
    private String deptName;

    @Override
    public void assignDepartment(String dept) { this.deptName = dept; }

    @Override
    public String getDepartmentDetails() { return "Department: " + deptName; }
}
