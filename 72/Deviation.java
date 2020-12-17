import java.util.Scanner;
import java.io.*;

public class Deviation {
    public static void main(String[] args) {
        File file; 
        Scanner scan;

        try {
            file = new File("ex2.txt");
            scan = new Scanner(file);

            double count = 0;
            double sum = 0;
            double sq = 0;

            while (scan.hasNextDouble()) {
                double nextDub = scan.nextDouble();
                count ++;
                sum += nextDub;
                sq += nextDub * nextDub;
            }

            double avsq = sq/count;
            double av = sum/count;
            double var = avsq - (av*av);
            double deviation = Math.sqrt(var);

            System.out.println("Average: " + av);
            System.out.println("Standard deviation: " + deviation);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
            System.exit(0);
        }
    } 
}