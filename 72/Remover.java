import java.util.Scanner;
import java.io.*;

public class Remover {
    public static void main(String[] args){
        File file;
        Scanner scan;

        PrintWriter output;

        try {
            file = new File("ex5.txt");
            scan = new Scanner(file);
            output = new PrintWriter("exx5.txt");

            while (scan.hasNext()){
                String word = scan.next();
                if (word.replaceAll("[^a-zA-Z]" , "").toLowerCase().equals("the") || word.replaceAll("[^a-zA-Z]" , "").toLowerCase().equals("of") || word.replaceAll("[^a-zA-Z]" , "is").toLowerCase().equals("a") || word.replaceAll("[^a-zA-Z]" , "").toLowerCase().equals("to") || word.replaceAll("[^a-zA-Z]" , "").toLowerCase().equals("is")){
                    output.print("");
                } else {
                    output.print(word + " ");
                }
            }

            output.close();
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0);
        }
    }
}