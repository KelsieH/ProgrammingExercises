import java.util.Scanner;

public class SumofOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scan.nextInt();
        
        int sum = 0;
        int square = n*n;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        System.out.println("The sum of all odd integers is " + sum + ". n squared is " + square);
    }
}