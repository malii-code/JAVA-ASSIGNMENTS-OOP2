//Week2-task1
//Malii Stephen Muungami
//CT100/G/22156/24
import java.util.Scanner;

public class CylinderCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double r = input.nextDouble();
        System.out.print("Enter height: ");
        double h = input.nextDouble();

        double volume = Math.PI * Math.pow(r, 2) * h;
        double surfaceArea = 2 * Math.PI * r * (r + h);

        System.out.printf("Volume: %.2f\n", volume);
        System.out.printf("Surface Area: %.2f\n", surfaceArea);
        
        input.close();
    }
}
