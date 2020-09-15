import java.util.Scanner;

public class Harmonic
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X: ");
        double x = scan.nextDouble();
        System.out.println("Enter Y: ");
        double y = scan.nextDouble();

        double h = (2/((1/x) + (1/y)));
        double mean = ((x + y)/2);

        System.out.println("Arithmetic mean: " + mean);
        System.out.println("Harmonic mean: " + h);
    }
}