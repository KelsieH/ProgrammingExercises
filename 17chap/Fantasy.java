import java.util.Scanner;

public class Fantasy
{
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Yertle's Quest!");
        System.out.println("Enter the name of your character: ");
        String name = scan.nextLine();

        System.out.println("Enter strength (1-10): ");
        int strength = scan.nextInt();
        System.out.println("Enter health (1-10): ");
        int health = scan.nextInt();
        System.out.println("Enter luck (1-10): ");
        int luck = scan.nextInt();

        if ((strength + health + luck) > 15) {
            System.out.println("You have given your character too many points! Default values have been applied to " + name + "... strength: 5, health: 5, luck: 5");
        } else {
            System.out.println(name + " is ready to go! Have fun!");
        }
    }
}