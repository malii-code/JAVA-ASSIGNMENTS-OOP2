//MALII STEPHEN MUUNGAMI
//CT100/G/22156/24
// HOSPITAL PATIENT MANAGEMENT
public class Patient {

    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private boolean admitted;

    public Patient(String id, String name, int age, String diagnosis) {
        this.patientId = id;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.admitted = false;
    }

    public String getPatientId() {
        return patientId;
    }

    public boolean isAdmitted() {
        return admitted;
    }

    public void admit() {
        admitted = true;
    }

    public void discharge() {
        admitted = false;
    }

    public void updateDiagnosis(String newDiagnosis) {
        diagnosis = newDiagnosis;
    }

    public void displayPatientInfo() {
        System.out.println(patientId + " " + name +
                " Age: " + age +
                " Diagnosis: " + diagnosis +
                " Admitted: " + admitted);
    }
}
