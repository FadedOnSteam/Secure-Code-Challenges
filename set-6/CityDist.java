import java.util.Scanner;
// is there something a user can do to make this program behave in a way that is not expected?

// is there an input that can make this program vulnerable?

public class CityDist {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int cityA;
        int cityB;
        int[][] Distances = new int[2][2];

        // Initialize distances array
        Distances[0][0] = 0;
        Distances[0][1] = 960;
        Distances[1][0] = 960;
        Distances[1][1] = 0;

        System.out.print("Enter city pair (Ex: 1 1) -- ");
        cityA = scnr.nextInt();
        cityB = scnr.nextInt();

        if ((cityA >= 0) && (cityA <= 2) && (cityB >= 0) && (cityB <= 2)) {
            System.out.print("Distance: " + Distances[cityA][cityB]);
            System.out.println(" miles.");
        }
        scnr.close();
    }
}
