import java.util.Scanner;

public class Integers
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = scan.nextInt();

        System.out.println("Enter End: ");
        int end = scan.nextInt();

        int i = start;
        while (i < end) {
            System.out.println(i);
            i++;
        }
        System.out.println(end);
    }
}