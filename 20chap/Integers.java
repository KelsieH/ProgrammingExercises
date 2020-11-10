import java.util.Scanner;
public class Integers 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many integers will be added?");
        int times = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < times; i++) {
            System.out.println("Enter integer");
            int number = scan.nextInt();
            sum += number;
        }

        System.out.println("Sum is: " + sum);
        scan.close();
    }
}