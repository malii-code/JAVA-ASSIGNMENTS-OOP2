//week3-task1
//Malii Stephen Muungami
//CT100/G/22156/24
import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for attendance
        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        // Prompt user for marks
        System.out.print("Enter average marks: ");
        double marks = sc.nextDouble();

        // Check conditions: Attendance must be 75+ AND marks must be 40+
        if (attendance >= 75 && marks >= 40) {
            System.out.println("Eligible for final exams.");
        } else {
            // If either condition fails, the student is not eligible
            System.out.println("Not eligible.");
        }
        
        sc.close(); // Close scanner to free resources
    }
}
