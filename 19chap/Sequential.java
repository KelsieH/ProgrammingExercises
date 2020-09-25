import java.util.Scanner;

public class Sequential
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scan.nextInt();

        int i = 0;
        int sum = 0;
        while (!(i > n)) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}