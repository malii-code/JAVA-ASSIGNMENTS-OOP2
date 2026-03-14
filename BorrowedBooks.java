//week7-task1
//Malii Stephen Muungami
//CT100/G/22156/24

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BorrowedBooks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter book title: ");
            String title = input.nextLine();

            // true means append without deleting old data
            FileWriter writer = new FileWriter("borrowed_books.txt", true);

            writer.write(title + "\n");

            writer.close();

            System.out.println("Book stored successfully.");

        } catch (IOException e) {

            System.out.println("Error writing to file.");

        }

        input.close();
    }
}
