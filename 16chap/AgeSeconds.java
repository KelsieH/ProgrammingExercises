import java.util.Scanner;

public class AgeSeconds
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Years?");
        int years = scan.nextInt();

        System.out.println("Months?");
        int months = scan.nextInt();

        System.out.println("Days?");
        int days = scan.nextInt();

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daysinmonths = 31;

        for (int i = 1; i < months; i++) {
            daysinmonths = daysinmonths + (monthDays[i]);
        }
        
        int seconds = ((years * 31536000) + (daysinmonths * 86400) + (days * 86400));

        System.out.println("You are " + seconds + " seconds old!");
    }
}