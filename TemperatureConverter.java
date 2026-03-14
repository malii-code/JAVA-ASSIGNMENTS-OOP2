//Week5-task3
//Malii Stephen Muungami
//CT100/G/22156/24

import java.util.Scanner;

public class TemperatureConverter {

    // Method converting Fahrenheit to Celsius
    public static double convertToCelsius(double fahrenheit) {

        return (fahrenheit - 32) * 5 / 9;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = input.nextDouble();

        double celsius = convertToCelsius(f);

        System.out.println("Temperature in Celsius: " + celsius);

        input.close();
    }
}
