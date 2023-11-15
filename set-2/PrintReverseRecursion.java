public class PrintReverseRecursion {
    public static void main(String[] args) {
        System.out.println("");
        printReverseRec(5);
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
