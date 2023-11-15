import java.util.Scanner;
// is there something a user can do to make this program behave in a way that is not expected?

// is there an input that can make this program vulnerable?

public class CityDist {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[][] Distances = new int[2][2];

        Distances[0][0] = 0;
        Distances[0][1] = 260;
        Distances[1][0] = 430;
        Distances[1][1] = 0;

        System.out.print("Enter city pair (Ex: 1 1) ");
        int A = scnr.nextInt();
        int B = scnr.nextInt();

        if ((A >= 0) && (A <= 1) && (B >= 0) && (B <= 1)) {
            System.out.print("Distance traveled: " + Distances[A][B] + " miles.");
            System.out.println();
        }
        scnr.close();
    }
}
