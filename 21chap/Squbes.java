import java.util.Scanner;

public class Squbes {
    public static void main (String[] args) {
        int i = 0;
        int squares = 0;
        int cubes = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the upper limit:");
        int n = scan.nextInt();
        
        while (i <= n) {
            squares += (i*i);
            cubes += (i*i*i);
            i++;
        }
        System.out.println("The sum of squares is " + squares + " and the sum of cubes is " + cubes);

    }
}