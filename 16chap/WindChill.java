import java.util.Scanner;

public class WindChill 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Wind Speed: ");
        double speed = scan.nextInt();

        System.out.println("Enter Temperature: ");
        double temp = scan.nextInt();

        double chill;
        if (speed < 3) {
            chill = temp;
        } else if (temp > 50) {
            chill = temp;
        } else {
            chill = (35.74 + (0.6215 * temp) - (35.75 * (Math.pow(speed, 0.16))) + (0.4275 * temp * (Math.pow(speed, 0.16))));
        }

        System.out.println("Wind chill: " + chill);
    }
}