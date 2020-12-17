import java.util.Scanner;
import java.io.*;

public class Seperate {
    public static void main(String[] args){
        File file;
        Scanner scan;

        try {
            file = new File("ex4.txt");
            scan = new Scanner(file);

            int x = 0;
            int y = 0;

            while (scan.hasNext()){
                String nextString = scan.nextLine();
                if (nextString.substring(0,3).equals("x= ")){
                    x += Integer.parseInt(nextString.substring(3));
                } else if (nextString.substring(0,3).equals("y= ")) {
                    y += Integer.parseInt(nextString.substring(3));
                }
            }

            scan.close();

            System.out.println("x sum: " + x);
            System.out.println("y sum: " + y);

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0);
        }
    }
}