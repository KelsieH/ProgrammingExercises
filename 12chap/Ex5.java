import java.util.Scanner;

public class Ex5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        System.out.println("Enter beginning index: ");
        int begin = scan.nextInt();
        System.out.println("Enter ending index: ");
        int end = scan.nextInt();

        String sub = str.substring(begin, end);

        System.out.println("Original string: " + str);
        System.out.println("Substring: " + sub);
    }
}