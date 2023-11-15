import java.util.Scanner;
public class Fib {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int x;
        System.out.println("What value would you like to find the fibonacci value of?");
        x = scnr.nextInt();
        System.out.println(fib(x));
        scnr.close();
        
    }
    public static  int fib(int n){
        if(n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else{
            return fib(n - 1) + fib(n - 2);
        }
    }
}
