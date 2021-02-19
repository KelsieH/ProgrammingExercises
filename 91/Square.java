import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        System.out.println(Rectangle(n));
    }

    public static int Rectangle(int n) {
        if (n==1) {
            return 1;
        } else {
            return Rectangle(n-1) + 2*(n)-1;
        }
    }
}