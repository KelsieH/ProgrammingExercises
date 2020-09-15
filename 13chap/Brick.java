import java.util.Scanner;

public class Brick
{
    public static void main(String[] args)
    {
        double g = 32.174;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of seconds: ");
        double seconds = scan.nextDouble();
        double distance = ((.5) * g * (seconds * seconds));

        System.out.println("Distance: " + distance);
    }
}