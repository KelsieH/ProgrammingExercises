import java.util.Scanner;

public class Change
{
    public static void main(String[] args)
    {
        int change;
        Scanner scan = new Scanner(System.in);

        System.out.println("How much change is due? (cents)");
        change = scan.nextInt();

        int dollars = (change/100);
        int leftovers = (change%100);
        int quarters = (leftovers/25);
        leftovers = (leftovers%25);
        int dimes = (leftovers/10);
        leftovers = (leftovers%10);
        int nickles = (leftovers/5);
        leftovers = (leftovers%5);

        System.out.println("Your change is: " + dollars + " dollar(s), " + quarters + " quarter(s), " + dimes + " dime(s), " + nickles + " nickle(s), " + leftovers + " cent(s).");
    }
}