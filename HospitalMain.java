//MALII STEPHEN MUUNGAMI
//CT100/G/22156/24
// HOSPITAL PATIENT MANAGEMENT
public class HospitalMain {

    public static void main(String[] args) {

        HospitalWard ward = new HospitalWard();

        Patient p1 = new Patient("P1","John",30,"Flu");
        Patient p2 = new Patient("P2","Mary",25,"Malaria");
        Patient p3 = new Patient("P3","Alex",40,"Fracture");
        Patient p4 = new Patient("P4","Sara",35,"Infection");

        // Admit patients
        ward.admitPatient(p1);
        ward.admitPatient(p2);
        ward.admitPatient(p3);

        // Discharge one
        ward.dischargePatient("P2");

        // Update diagnosis
        p3.updateDiagnosis("Recovered");

        // Display admitted
        System.out.println("Admitted patients:");
        ward.listAdmittedPatients();
    }
}
