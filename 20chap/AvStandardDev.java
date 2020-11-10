import java.util.Scanner;
public class AvStandardDev {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter N: ");
        int n = scan.nextInt();
        float av = 0;
        float standev = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter integer");
            float num = scan.nextFloat();
            av += num;
            standev += (num*num);
        }
        av = av / n;
        standev = standev / n;
        standev = (float) Math.sqrt(standev - av*av);
        System.out.println("The standard deviation is: " + standev);
        System.out.println("The average is: " + av);
        scan.close();
    }
}