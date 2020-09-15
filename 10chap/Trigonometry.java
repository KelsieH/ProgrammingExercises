public class Trigonometry
{
    public static void main ( String[] args )
    {
        double sin = Math.sin(0.5236);
        double cos = Math.cos(0.5236);
        double squaresum = ((sin * sin) + (cos * cos));

        System.out.println("sine: " + sin + " cosine: " + cos + " sum of squares: " + squaresum);
    }
}