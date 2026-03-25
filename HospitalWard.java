//MALII STEPHEN  MUUNGAMI
//CT100/G/22156/24
// HOSPITAL PATIENT MANAGEMENT
public class HospitalWard {

    private Patient[] patients = new Patient[20];
    private int count = 0;

    public void admitPatient(Patient p) {
        p.admit();
        patients[count++] = p;
    }

    public void dischargePatient(String id) {
        for (Patient p : patients) {
            if (p != null && p.getPatientId().equals(id)) {
                p.discharge();
            }
        }
    }

    public void listAdmittedPatients() {
        for (Patient p : patients) {
            if (p != null && p.isAdmitted()) {
                p.displayPatientInfo();
            }
        }
    }
}
