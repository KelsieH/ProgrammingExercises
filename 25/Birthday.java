import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of guests:");
        int n = scan.nextInt();
        double probability = 1.0;
        int guests = 0;

        for (int i = 1; i < n; i++) {
            probability *= ((365.0 - i)/365.0);
        }
        System.out.println("Probability that no one shares a birthday is " + probability + "%");
    }
}