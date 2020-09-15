import java.util.Scanner;

public class Discount
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of purchases: ");
        int amount = scan.nextInt();
        double discount;

        if (amount > 10) {
            discount = (amount - (amount * 0.1));
            System.out.println("Discounted price: " + discount);
        } else {
            System.out.println("No discount.");
        }
    }
}