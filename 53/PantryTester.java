import java.util.Scanner;

public class PantryTester {
    public static void main ( String[] args ) {
      Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
      Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
      Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Welcome to Mother Hubbard's Pantry!");
      Pantry hubbard = new Pantry( goose, apple, rhub );
      System.out.println( hubbard );

      System.out.println("Enter your selection (1, 2, or 3):");
      int select = scan.nextInt()

      while (select != -1) {
        
        System.out.println("Enter amount to spread");
        int spread = scan.nextInt();

        hubbard.select(select);
        hubbard.spread(spread);
        System.out.println(hubbard);

        System.out.println("Enter your selection (1, 2, or 3):");
        select = scan.nextInt()

      }
    }
}