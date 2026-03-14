//week5-task1
//Malii Stephen Muungami 
//CT100/G/22156/24

import java.util.Scanner;

public class ElectricBillCalculator {

    // Method to calculate electricity bill
    public static double calculateElectricBill(int units) {

        double bill;

        if (units <= 100) {
            bill = units * 10;
        } 
        else if (units <= 200) {
            bill = (100 * 10) + ((units - 100) * 15);
        } 
        else {
            bill = (100 * 10) + (100 * 15) + ((units - 200) * 20);
        }

        return bill;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        int units = input.nextInt();

        double totalBill = calculateElectricBill(units);

        System.out.println("Total Bill: KSh " + totalBill);

        input.close();
    }
}
