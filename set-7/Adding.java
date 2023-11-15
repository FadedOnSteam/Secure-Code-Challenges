import java.util.InputMismatchException;
import java.util.Scanner;
public class Adding {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int x, y, sum;

        try{
            System.out.println("Please input the first integer you would like to add.");
            x = scnr.nextInt();
            System.out.println("Please input the second integer you would like to add.");
            y = scnr.nextInt();
            sum = addition(x, y);

            System.out.println("The sum of " + x + " and " + y + " equals: " + sum); 
        }catch(InputMismatchException e){
            System.out.println("Invalid input detected.");
        }
        scnr.close();
    }
    public static int addition(int x, int y){
        return x + y;
    }
}

