import java.util.Scanner;

public class Money
{
    public static void main(String[] args)
    {
        int cents;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the cents: ");
        cents = scan.nextInt();

        int dollars = cents/100;
        int leftovers = cents%100;

        System.out.println("That is " + dollars + " dollars and " + leftovers + " cents.");
    }
}
