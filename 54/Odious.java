import java.util.Scanner;

public class Odious {
    public static boolean test(long n) {
        int total = 1;
        long num = n;

        while (num/2 != 0) {
            total += num%2;
            num = num/2;
        }

        return n%2 == 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number:");
        long num = scan.nextLong();

        while (num > 0) {
            if (testNum(num)) {
                System.out.println(num + " is an odious number");
            } else {
                System.out.println(num + " is an evil number");
            }

            System.out.println("\nEnter number: ");
            num = scan.nextLong();
        }
    }
}