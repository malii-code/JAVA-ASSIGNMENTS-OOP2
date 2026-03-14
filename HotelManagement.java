//week6
//Malii Stephen Muungami
//CT100/G/22156/24

import java.util.Random;
import java.util.Scanner;

public class HotelManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // 1D ARRAY – revenue for 7 days
        double[] revenue = new double[7];
        double totalRevenue = 0;

        for (int i = 0; i < 7; i++) {

            System.out.print("Enter revenue for day " + (i + 1) + ": ");
            revenue[i] = input.nextDouble();

            totalRevenue += revenue[i];
        }

        double averageRevenue = totalRevenue / 7;

        System.out.println("Total weekly revenue: " + totalRevenue);
        System.out.println("Average daily revenue: " + averageRevenue);

        // 2D ARRAY – room occupancy
        int[][] occupancy = new int[5][10];

        for (int floor = 0; floor < 5; floor++) {

            int occupied = 0;
            int vacant = 0;

            for (int room = 0; room < 10; room++) {

                occupancy[floor][room] = random.nextInt(2);

                if (occupancy[floor][room] == 1)
                    occupied++;
                else
                    vacant++;
            }

            System.out.println("Floor " + (floor + 1) +
                    " Occupied: " + occupied +
                    " Vacant: " + vacant);
        }

        // 3D ARRAY – hotel chain
        int[][][] chain = new int[3][5][10];
        int totalOccupied = 0;

        for (int branch = 0; branch < 3; branch++) {

            for (int floor = 0; floor < 5; floor++) {

                for (int room = 0; room < 10; room++) {

                    chain[branch][floor][room] = random.nextInt(2);

                    if (chain[branch][floor][room] == 1)
                        totalOccupied++;
                }
            }
        }

        System.out.println("Total occupied rooms across all branches: " + totalOccupied);

        input.close();
    }
}
