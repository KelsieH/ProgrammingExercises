import java.util.Scanner;

public class Combinations {
    public static long factorial(int i) {
        long fac = 1;
        for (int j=1; j<= i; j++){
            fac *= j;
        }
        return fac;
    }

    public static long nCr(int n, int r) {
        return (factorial(n)/(factorial(r)*factorial(n-r)));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = scan.nextInt();
        System.out.println("Enter R:");
        int r = scan.nextInt();

        System.out.println("nCr: " + nCr(n, r));
    }
}