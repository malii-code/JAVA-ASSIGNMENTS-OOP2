//week1-task2
//Malii stephen Muungami
//CT100/G/22156/24
import java.util.Scanner;

 // Objective: Collect and display user details using appropriate data types.
public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // i. Collect Height (using float for decimal precision)
        System.out.print("Enter your height (in meters, e.g., 1.75): ");
        float height = scanner.nextFloat();

        // ii. Collect Bank Balance (using double for financial accuracy)
        System.out.print("Enter your bank balance (KES): ");
        double balance = scanner.nextDouble();

        // iii. Collect Phone Number (using String to preserve leading zeros)
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.next();

        // Displaying the formatted output
        System.out.println("\n--- User Details Summary ---");
        System.out.println("Height: " + height + " meters");
        System.out.println("Bank Balance: KES " + balance);
        System.out.println("Phone Number: " + phoneNumber);

        scanner.close();
    }
}
