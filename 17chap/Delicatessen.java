import java.util.Scanner;

public class Delicatessen 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the item: ");
        String item = scan.nextLine();

        System.out.println("Enter the price: ");
        double price = scan.nextDouble();

        System.out.println("Overnight delivery? (0=no, 1=yes): ");
        double doDeliver = scan.nextDouble();

        double finalPrice;
        double delivery;

        if (price < 10) {
            delivery = 2.00;
        } else {
            delivery = 0;
        }
        
        if (doDeliver == 1) {
            delivery = (delivery + 3.00);
        } 

        finalPrice = (price + delivery);

        System.out.println("Item: " + item + " , delivery: " + delivery + " , total: " + finalPrice );
    }
}