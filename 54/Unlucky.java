import java.util.Scanner;

public class Unlucky {
    public static boolean test(long n) {
        long rem = n/10;
        return rem == 13;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        long num = scan.nextLong();

        String status = "safe";

        if (test(num)) {
            status = "Unlucky";
        }
        System.out.println(num + " is " + status);
        scan.close();
    }
}