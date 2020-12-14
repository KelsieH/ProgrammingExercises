import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X");
        double x = scan.nextDouble();

        System.out.println("Enter N");
        int n = scan.nextInt();
        scan.close();

        double power = x;
        int i = 0;

        if (n > 0) {
            while (i < (n-1)) {
                power = power * x;
                i++;
            }
            System.out.println(x + " raised to the power" + n + " is " + power);
        } else {
            System.out.println("N must be a positive integer.");
        }
    }
}