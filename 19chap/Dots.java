import java.util.Scanner;

public class Dots
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String word = scan.nextLine();
        System.out.println("Enter the second word: ");
        String word2 = scan.nextLine();

        int length1 = word.length();
        int length2 = word2.length();

        System.out.println(word);
        int i = length1;
        int amount = (30 - (length1 + length2));
        while (!(i>amount)) {
            System.out.println(".");
            i++;
        }
        System.out.println(word2);
    }
}