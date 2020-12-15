import java.util.Scanner;

public class Hailstone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N:");
        long n = scan.nextInt();
        long max = 0;
        int length = 0;

        while (n != 1) {
            long ye = 0;
            if (n % 2 == 0) {
                ye = n/2;
                if (ye > n) {
                    max = ye;
                } 
                System.out.println(ye);
                length += 1;
                n = ye;
            } else {
                ye = 3 * n + 1;
                if (ye > n) {
                    max = ye;
                }
                System.out.println(ye);
                length += 1;
                n = ye;
            }
        }
        System.out.println("Maximum is " + max + "\nSequence length is " + (length + 1));
    }
}