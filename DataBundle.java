//week3-task3
//Malii Stephen Muungami
//CT100/G/22156/24
import java.util.Scanner;

public class DataBundle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Displaying the menu options to the user
        System.out.println("Select data bundle:");
        System.out.println("1. 100MB @ 50 KES");
        System.out.println("2. 500MB @ 200 KES");
        System.out.println("3. 1GB   @ 350 KES");
        System.out.println("4. 2GB   @ 600 KES");
        
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        // Use switch to match the user's input to the correct bundle
        switch (choice) {
            case 1:
                System.out.println("You selected 100MB. Cost = 50 KES");
                break; // Exit the switch once a match is found
            case 2:
                System.out.println("You selected 500MB. Cost = 200 KES");
                break;
            case 3:
                System.out.println("You selected 1GB. Cost = 350 KES");
                break;
            case 4:
                System.out.println("You selected 2GB. Cost = 600 KES");
                break;
            default:
                // This executes if the user enters anything other than 1, 2, 3, or 4
                System.out.println("Invalid choice");
                break;
        }
        
        sc.close();
    }
}
