import java.util.Scanner;

public class Velocity {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("What was the initial position? ");
        int initialPosition = scnr.nextInt();
        System.out.println("What was the final position");
        int finalPosition = scnr.nextInt();
        System.out.println("What was the initial time?");
        int initialTime = scnr.nextInt();
        System.out.println("What was the final time?");
        int finalTime = scnr.nextInt();

        System.out.println("The velocity of the object is "
                + calcVelocity(initialPosition, finalPosition, initialTime, finalTime));
                
        printReverseRec(5);
        scnr.close();

    }

    public static double calcVelocity(int initialPos, int finalPos, int initialTime, int finalTime) {
        return (finalPos - initialPos) / (finalTime - initialTime);
    }

    public static void printReverseRec(int n) {
        if (n == 1) {
            System.out.print(n);
        } else {
            System.out.print(n + ", ");
            printReverseRec(--n);
        }

    }

}