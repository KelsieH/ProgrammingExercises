import java.util.Scanner;

public class Range
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter low: ");
        int low = scan.nextInt();
        System.out.println("Enter high: ");
        int n = scan.nextInt();

        int sum = (n*(n+1))/2;
        int lower = low - 1;
        int sum2 = (lower*(lower+1))/2;
        int finall = sum - sum2;
        System.out.println("Sum = " + finall);
    }
}