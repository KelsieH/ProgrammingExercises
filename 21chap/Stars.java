import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter initial number of stars:");
        int stars = scan.nextInt();
        scan.close();

        while (stars > 0) {
            int i = 0;
            while (i < stars) {
                System.out.println("*");
                i++;
            }
            stars--;
        }
    }
}