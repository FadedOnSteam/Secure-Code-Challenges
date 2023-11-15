import java.util.Scanner;

// Is there any input the user can give to make this code work unexpectedly.
public class OldestPeople {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] oldestPeople = new int[5];
        int nthPerson; // User input, Nth oldest person

        oldestPeople[0] = 122; // Died 1997 in France
        oldestPeople[1] = 119; // Died 1999 in U.S.
        oldestPeople[2] = 117; // Died 1993 in U.S.
        oldestPeople[3] = 117; // Died 1998 in Canada
        oldestPeople[4] = 116; // Died 2006 in Ecuador
        // oldestPeople[5] = 116; // Died 2005 in U.S.
        // Out of all the oldest people, choose one of them.
        System.out.print("Enter N (1-5): ");
        int num = scnr.nextInt();
        System.out.println(oldestPeople[num]);

        if ((num >= 1) && (num <= 5)) {
            System.out.print("The " + num + "th oldest person lived ");
            System.out.println(oldestPeople[num - 1] + " years.");
        }
        scnr.close();
    }
}
