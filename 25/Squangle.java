import java.util.Scanner;
import java.lang.Math;

public class Squangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter max number");
        int max = scanner.nextInt();

        for (int i = 1; i < Math.sqrt(max); i++){
            int num = i * j;

            for (int j = 0; j <= num/2; j++) {
                if (j*(j+1) / 2 == num) {
                    System.out.println( num + " is a triangle and a sqaure.");
                }
            }
        }
    }
}