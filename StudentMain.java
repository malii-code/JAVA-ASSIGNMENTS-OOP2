//MALII STEPHEN MUUNGAMI
//CT100/G/22156/24
public class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student("S1", "Alex", new int[]{80,75,90,85,70});
        Student s2 = new Student("S2", "Brian", new int[]{60,65,55,70,60});
        Student s3 = new Student("S3", "Clara", new int[]{90,95,85,88,92});

        Student[] students = {s1, s2, s3};

        double highest = 0;
        Student top = null;

        for (Student s : students) {
            s.displayStudentReport();

            if (s.calculateAverage() > highest) {
                highest = s.calculateAverage();
                top = s;
            }
        }

        System.out.println("Top Student:");
        top.displayStudentReport();
    }
}
