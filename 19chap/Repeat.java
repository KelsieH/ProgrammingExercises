import java.util.Scanner;

public class Repeat
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();

        int times = word.length();
        int i = 0;
        while (i<times) {
            System.out.println(word);
            i++;
        }
    }
}