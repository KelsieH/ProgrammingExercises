public class Reassign
{
    public static void main ( String[] args )
    {
        double x = 0;
        double y = ((3 * (x*x)) - (8 * x) + (4));
        System.out.println("At X = " + x + ", the value is " + y);

        x = 2;
        y = ((3 * (x*x)) - (8 * x) + (4));
        System.out.println("At X = " + x + ", the value is " + y);

        x = 4;
        y = ((3 * (x*x)) - (8 * x) + (4));
        System.out.println("At X = " + x + ", the value is " + y);
    }
}