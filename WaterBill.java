//week3-task2
//Malii Stephen Muungami
//CT100/G/22156/24
import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter water units consumed: ");
        int units = sc.nextInt();
        double totalBill;

        // Logic for tiered pricing
        if (units <= 30) {
            // First tier: 0-30 units at 20 KES
            totalBill = units * 20;
        } else if (units <= 60) {
            // Second tier: 31-60 units at 25 KES
            totalBill = units * 25;
        } else {
            // Third tier: Above 60 units at 30 KES
            totalBill = units * 30;
        }

        // Output formatting: %.2f ensures 2 decimal places (e.g., 1025.00)
        System.out.printf("Total water bill: %.2f KES\n", totalBill);
        
        sc.close();
    }
}
