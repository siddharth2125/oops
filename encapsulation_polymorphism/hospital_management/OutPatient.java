public class OutPatient extends Patient implements MedicalRecord {
    private int visits;
    private StringBuilder records = new StringBuilder();

    public OutPatient(String id, String name, int age, int visits) { super(id, name, age); this.visits = visits; }
    @Override public double calculateBill() { return visits * 500; }
    @Override public void addRecord(String record) { records.append(record).append("\\n"); }
    @Override public String viewRecords() { return records.toString(); }
}
