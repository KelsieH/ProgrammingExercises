import java.util.Scanner;

public class Microwave
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many items?");
        int items = scan.nextInt();

        System.out.println("What is the single-item heating time?");
        int time = scan.nextInt();

        int totalSecs;
        if (time >= 100) {
            int seconds = time % 100;
            int minutes = ((time - seconds)/100) * 60;
            totalSecs = minutes + seconds;
        } else {
            totalSecs = time;
        }

        int calct;
        boolean shouldHeat = true;
        if (items == 2) {
            totalSecs = (totalSecs + (totalSecs/2));
        } else if (items == 3) {
            totalSecs = (totalSecs * 2);
        } else if (items > 3) {
            shouldHeat = false;
        } 

        if (shouldHeat) {
            int mins = totalSecs / 60;
            int secs = totalSecs % 60;
            
            System.out.println("Heat for " + mins + " minutes " + secs + " seconds.");
        } else {
            System.out.println("Don't heat more than 3 items.");
        }

    }
}