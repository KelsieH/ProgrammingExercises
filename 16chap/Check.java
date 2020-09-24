import java.util.Scanner;

public class Check
{
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many bolts?");
        int bolts = scan.nextInt();

        System.out.println("How many nuts?");
        int nuts = scan.nextInt();

        System.out.println("How many washers?");
        int washers = scan.nextInt();

        if ((nuts >= bolts) && (washers >= (bolts *2))) {
            System.out.println("Your order is good!");
        } else if (nuts < bolts) {
            System.out.println("Too few nuts.");
        } else if (washers < (bolts * 2)) {
            System.out.println("Too few washers.");
        }

        final int price = ((bolts * 5) + (nuts * 3) + (washers));
        System.out.println("Total cost: " + price);

    }
}