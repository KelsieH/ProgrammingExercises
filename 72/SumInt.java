import java.io.*;
import java.util.Scanner;

public class SumInt {
    public static void main(String[] args) {
        File file;
        Scanner scan;

        try {
            file = new File("ex1.txt");
            scan = new Scanner(file);

            int sum = 0;
            while (scan.hasNextInt()) {
                sum += scan.nextInt();
            }

            System.out.println("SUm: " + sum);
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
            System.exit(0);
        } finally {
            System.out.println("Done!");
        }
    }
}