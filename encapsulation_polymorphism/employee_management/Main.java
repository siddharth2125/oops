public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
            new FullTimeEmployee("FT001", "Alice", 30000, 5000),
            new PartTimeEmployee("PT001", "Bob", 5000, 80, 150)
        };

        for (Employee e : employees) {
            e.displayDetails(); // polymorphism: Employee reference
        }

        HRDepartment hr = new HRDepartment();
        hr.assignDepartment("Human Resources");
        System.out.println(hr.getDepartmentDetails());
    }
}
