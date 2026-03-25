//MALII STEPHEEN MUUNGAMI
//CT100/G/22156/24
// Class representing a bank account
public class BankAccount {

    // Private attributes (Encapsulation)
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor to initialize values
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw money if enough balance
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("------------------------");
    }
}
