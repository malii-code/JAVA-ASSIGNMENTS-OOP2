//week4-tqsk2
//Malii Stephen Muungami
//CT100/G/22156/24

import java.util.Scanner;

public class ATMWithdrawal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initial account balance
        double balance = 5000;

        // Continue withdrawing while balance is positive
        while (balance > 0) {

            System.out.println("Current balance: " + balance);
            System.out.print("Enter amount to withdraw: ");

            double withdraw = input.nextDouble();

            balance = balance - withdraw;

            System.out.println("Remaining balance: " + balance);
        }

        System.out.println("Account balance is zero or negative. No more withdrawals allowed.");

        input.close();
    }
}
