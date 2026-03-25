//MALII STEPHEN MUUNGAMI
//CT100/G/22156/24
public class Student {

    private String studentId;
    private String name;
    private int[] marks;

    public Student(String id, String name, int[] marks) {
        this.studentId = id;
        this.name = name;
        this.marks = marks;
    }

    public int calculateTotal() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }

    public double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    public char findGrade() {
        double avg = calculateAverage();

        if (avg >= 80) return 'A';
        else if (avg >= 60) return 'B';
        else if (avg >= 50) return 'C';
        else return 'F';
    }

    public void displayStudentReport() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + findGrade());
        System.out.println("----------------------");
    }
}
