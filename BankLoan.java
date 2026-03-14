//week2-task2
//Malii Stephen Muungami
//CT100/G/22156/24
import java.util.Scanner;

public class BankLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your annual income (Sh): ");
        double income = sc.nextDouble();

        // Validation logic
        if (age >= 21 && income >= 21000) {
            System.out.println("Congratulations you qualify for a loan.");
        } else {
            System.out.println("Unfortunately, we are unable to offer you a loan at this time.");
        }
        
        sc.close();
    }
}
