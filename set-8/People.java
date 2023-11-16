import java.util.Scanner;

// Is there any input the user can give to make this code work unexpectedly.
public class People {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] Person = new int[4];
        int nthPerson;

        Person[0] = 1;
        Person[1] = 11;
        Person[2] = 33;
        Person[3] = 55;
        System.out.println("Enter the person number you would like to see the age of: ");
        nthPerson = scnr.nextInt();

        System.out.println("Person " + nthPerson + ": " + Person[nthPerson] + " years old.");

    }
}
