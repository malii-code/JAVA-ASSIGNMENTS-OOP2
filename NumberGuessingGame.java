//week4-task2
//Malii Stephen Muungami
//CT100/G/22156/24

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate random number between 1 and 20
        int secretNumber = random.nextInt(20) + 1;

        int guess;
        int attempts = 0;

        do {

            System.out.print("Guess a number between 1 and 20: ");
            guess = input.nextInt();

            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            }

        } while (guess != secretNumber);

        System.out.println("Congratulations! You guessed correctly.");
        System.out.println("Total attempts: " + attempts);

        input.close();
    }
}
