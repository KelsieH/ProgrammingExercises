import java.util.Scanner;

public class Logarithm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        System.out.println(Log(n));
    }

    public static int Log(int n) {
        if (n==1) {
            return 0;
        } else {
            return Log(n/2) + 1;
        }
    }
}