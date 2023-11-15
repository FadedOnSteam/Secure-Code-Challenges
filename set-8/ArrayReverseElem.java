import java.util.Scanner;

public class ArrayReverseElem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num = 4;
        int[] userVals = new int[num];
        int i;

        System.out.println("Enter " + num + " integer values...");
        try {
            for (i = 0; i < userVals.length; ++i) {
                System.out.print("Value: ");
                userVals[i] = scnr.nextInt();
            }

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
