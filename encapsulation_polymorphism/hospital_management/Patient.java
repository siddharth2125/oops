public abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String id, String name, int age) { this.patientId = id; this.name = name; this.age = age; }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient: " + name + " (" + patientId + "), age " + age + ", Bill: " + calculateBill());
    }

    // Encapsulation for sensitive data would be here (not shown)
}
