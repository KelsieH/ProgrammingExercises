import java.util.Scanner;

public class CircleArea
{
    public static void main (String[] args)
    {
        int radius;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the radius: ");
        radius = scan.nextInt();

        double area;
        area = ((Math.PI) * (radius * radius));

        System.out.println("The radius is: " + radius + "The area is: " + area);
    }
}