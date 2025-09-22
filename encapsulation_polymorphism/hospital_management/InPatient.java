public class InPatient extends Patient implements MedicalRecord {
    private int days;
    private StringBuilder records = new StringBuilder();

    public InPatient(String id, String name, int age, int days) { super(id, name, age); this.days = days; }
    @Override public double calculateBill() { return days * 2000; }
    @Override public void addRecord(String record) { records.append(record).append("\\n"); }
    @Override public String viewRecords() { return records.toString(); }
}
