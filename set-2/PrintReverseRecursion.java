import java.util.Scanner;

public class PrintReverseRecursion {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("");
        System.out.print("What value would you like to print recursively in reverse? ");
        int user = scnr.nextInt();
        printReverseRec(user);
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
