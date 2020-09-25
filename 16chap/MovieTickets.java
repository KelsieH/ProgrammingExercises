import java.util.Scanner;

public class MovieTickets 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your age?");
        int age = scan.nextInt();

        System.out.println("What is the time?");
        int time = scan.nextInt();
        int price;

        if (time < 1700) {
            if (age > 13) {
                price = 5;
            } else {
                price = 2;
            }
        } else {
            if (age > 13) {
                price = 8;
            } else {
                price = 4;
            }
        }

        System.out.println("The price is " + price);
    }
}