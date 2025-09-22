public class Main {
    public static void main(String[] args) {
        Patient[] patients = new Patient[] {
            new InPatient("P100", "Seema", 45, 5),
            new OutPatient("P200", "Arjun", 30, 2)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            if (p instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord)p;
                mr.addRecord("Checked on 2025-09-18");
                System.out.println("  Records: " + mr.viewRecords());
            }
        }
    }
}
