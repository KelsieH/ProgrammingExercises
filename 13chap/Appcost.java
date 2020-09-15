import java.util.Scanner;

public class Appcost
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cost per kilowatt-hour in cents: ");
        double cost = scan.nextDouble();
        cost = cost/100;

        System.out.println("Enter kilowatt-hours used per year: ");
        double hours = scan.nextDouble();

        double annual = (cost * hours);

        System.out.println("Annual cost: " + annual);
    }
}