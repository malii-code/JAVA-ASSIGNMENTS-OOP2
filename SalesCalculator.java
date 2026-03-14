//wee7-task3
//Malii Stephen Muungami
//CT100/G/22156/24

import java.io.*;
import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args) {
        double totalSales = 0.0;
        File file = new File("sales.txt");

        // try-with-resources automatically closes the Scanner/File after use
        try (Scanner fileReader = new Scanner(file)) {
            
            while (fileReader.hasNextDouble()) {
                double transaction = fileReader.nextDouble();
                totalSales += transaction;
            }
            
            System.out.printf("Total sales for the day: KES %.2f\n", totalSales);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: sales.txt not found. Ensure the file exists in the project folder.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
