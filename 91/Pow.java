import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("n must be a positive integer");
        } else {
            System.out.println(Poww(n));
        }

    }

    public static int Poww(int n) {
        if (n==0) {
            return 1;
        } else {
            return Poww(n-1) * 2;
        }
    }
}