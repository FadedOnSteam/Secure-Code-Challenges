import java.util.Scanner;
public class Velocity {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int initialPosition, finalPosition, initialTime, finalTime;

        System.out.println("What was the initial position? ");
        initialPosition = scnr.nextInt();
        System.out.println("What was the final position");
        finalPosition = scnr.nextInt();
        System.out.println("What was the initial time?");
        initialTime = scnr.nextInt();
        System.out.println("What was the final time?");
        finalTime = scnr.nextInt();

        System.out.println("The velocity of the object is " + calcVelocity(initialPosition, finalPosition, initialTime, finalTime));
        scnr.close();

    }

    public static double calcVelocity(int initialPos, int finalPos, int initialTime, int finalTime) {
        return (finalPos - initialPos) / (finalTime - initialTime);
    }
}
