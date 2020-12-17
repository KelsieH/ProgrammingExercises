import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.FileWriter;

public class Todo {
    public static void main(String[] args) throws IOException{
        System.out.println("To-Do list:");

        File file;
        Scanner scan;
        Scanner userScan;
        PrintWriter output;

        try {
            file = new File("todo.txt");
            scan = new Scanner(file);
            userScan = new Scanner(System.in);
            output = new PrintWriter(new FileWriter("tasks.txt", true));

            Task newTask;

            System.out.println("Options: Create a new task (1), Update an existing task (2), Clear all tasks (3), Quit (4)");
            int choice = userScan.nextInt();

            if (choice != 4) {
                ArrayList<String> taskStuff = new ArrayList<String>();

                if (choice == 1) {

                    System.out.println("Enter description of task:");
                    taskStuff.add(userScan.nextLine());
                    System.out.println("Enter the due date:");
                    taskStuff.add(userScan.nextLine());
                    System.out.println("Enter the priority on a scale from 1-5:");
                    taskStuff.add(userScan.nextLine());
                    System.out.println("Enter task status (t or f)");
                    taskStuff.add(userScan.nextLine());

                } else if (choice == 2) {
                    if (taskStuff.isEmpty()) {
                        System.out.println("You do not have any tasks.");
                    } 
                } else if (choice == 3) {
                    
                }

            } else if (choice == 4) {
                scan.close();
                System.exit(0);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0);
        }
    }
} 