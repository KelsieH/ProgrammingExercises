import java.util.Scanner;

public class TriangleTester
{
  public static void main ( String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a value for n: ");
    int n = scan.nextInt();
    
    System.out.println(Triangle(n));
  }

  public static int Triangle( int n )
  {
    if ( n == 1 )
      return 1;
    else
      return n + Triangle( n-1 );
  }
}