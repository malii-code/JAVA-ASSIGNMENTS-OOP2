//week4-task3
//Malii Stephen Muungami
//CT100/G/22156/24

import java.util.Scanner;

public class PasswordSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String password;

        // Loop until correct password is entered
        do {

            System.out.print("Enter password: ");
            password = input.nextLine();

        } while (!password.equals("1234"));

        System.out.println("Access Granted");

        input.close();
    }
}
