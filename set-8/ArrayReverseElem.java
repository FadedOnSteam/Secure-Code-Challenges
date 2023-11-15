import java.util.Scanner;

public class ArrayReverseElem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 4; // Number of elements
        int[] userVals = new int[NUM_ELEMENTS]; // User numbers
        int i; // Loop index

        // Prompt user to input values
        System.out.println("Enter " + NUM_ELEMENTS
                + " integer values...");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print("Value: ");
            userVals[i] = scnr.nextInt();
        }

        // Reverse array's elements
        for (i = 0; i < userVals.length; ++i) {
            userVals[i] = userVals[userVals.length - 1 - i]; // Swap
        }

        // Print numbers
        try {
            System.out.print("\nNew values: ");

            for (i = 0; i < userVals.length + 1; ++i) {
                System.out.print(userVals[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("");
            System.out.println("Sadly the program failed :( ");
        }

    }
}
