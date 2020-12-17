import java.util.Scanner;
import java.io.*;

public class Filter {
    public static void main(String[] args) {
        File file;
        Scanner scan;
        Scanner userScan = new Scanner(System.in);

        PrintWriter neg;
        PrintWriter pos;

        System.out.println("Enter input: ");
        String input = userScan.nextLine();

        System.out.println("Enter negative file: ");
        String negFile = userScan.nextLine();
        System.out.println("Enter positive file");
        String posFile = userScan.nextLine();

        try {
            file = new File(input);
            scan = new Scanner(file);

            neg = new PrintWriter(negFile);
            pos = new PrintWriter(posFile);

            while (scan.hasNextInt()){
                int nextInt = scan.nextInt();

                if (nextInt < 0){
                    neg.println(nextInt);
                } else {
                    pos.println(nextInt);
                }
            }
        }  catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0);
        }
    }
}