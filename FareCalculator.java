//week5-task2
//Malii Stephen Muungami
CT100/G/22156/24
import java.util.Scanner;

public class FareCalculator {

    // Method to calculate fare
    public static double calculateFare(double distance) {

        return distance * 50;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance travelled (km): ");
        double distance = input.nextDouble();

        double fare = calculateFare(distance);

        System.out.println("Total Fare: KSh " + fare);

        input.close();
    }
}
