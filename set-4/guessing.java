import java.util.Scanner;
import java.util.Random;
public class guessing {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random numGenerator = new Random();
        boolean guessed = false;
        int computerNum;
        int userGuess;

        computerNum = numGenerator.nextInt(11);
        System.out.println("please guess a number from 1-10");
        userGuess = scnr.nextInt();
        while(!guessed){
            if(userGuess == computerNum){
                System.out.println("You guessed the number!!!");
            }
            else if(userGuess > computerNum){
                System.out.println("Guess is too high, try again");
                userGuess = scnr.nextInt();
            }
            else{
                System.out.println("Guess is too low, try again");
                userGuess = scnr.nextInt();
            }
        }
        System.out.println("Thank you for playing!");
        scnr.close();
    }

}
