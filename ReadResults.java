//week7-task2
//Malii Stephen Muungami
//CT100/G/22156/24
import java.io.*;

// Defining a structure (Class) to hold student information
class StudentRecord {
    String name;
    String regNumber;
    int totalMarks;

    // Constructor to initialize the data
    StudentRecord(String name, String regNumber, int totalMarks) {
        this.name = name;
        this.regNumber = regNumber;
        this.totalMarks = totalMarks;
    }
}

public class ReadResults {
    public static void main(String[] args) {
        // Use DataInputStream to read primitive data types from a binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream("results.dat"))) {
            
            System.out.println("--- Student Examination Results ---");
            
            // Loop until the end of the file is reached
            while (dis.available() > 0) {
                String name = dis.readUTF();         // Read string
                String regNo = dis.readUTF();        // Read string
                int marks = dis.readInt();           // Read integer
                
                System.out.println("Name: " + name + " | Marks: " + marks);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: results.dat file not found. Please create it first.");
        } catch (IOException e) {
            System.out.println("Error reading binary file: " + e.getMessage());
        }
    }
}
