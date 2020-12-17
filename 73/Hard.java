import java.util.Scanner;
import java.io.*;

public class Hard{
    public static void main(String[] args){
        File file;
        Scanner scan;

        try {
            file = new File("ex2.txt");
            scan = new Scanner(file);
            int sum = 0;
            int group = 0;

            while (scan.hasNext()){

                if(scan.next().equals("next")) {
                    group++;
                    while (scan.hasNextInt()) {
                        sum += scan.nextInt();
                    }
                    if (sum == 0){
                        System.out.println(group + " is empty!");
                    } else {
                        System.out.println("Sum of " + group + " is: " + sum);
                    }
                    sum = 0;

                } else {
                    scan.next();
                    sum = 0;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(0);
        }
        
    }
}