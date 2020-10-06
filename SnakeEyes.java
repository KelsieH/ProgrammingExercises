import java.util.Scanner;
import java.util.Random;

public class SnakeEyes
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Random randomGenerator = new Random();
        int max = 6;
        System.out.println("How many times?");
        int rounds = scan.nextInt();
        int i = 0;
        int score = 0;
        int rolls = 0;
        double overFour = 0;
        int rrollss = 0;
        boolean notWin = true;

        while (i<rounds) {
            while (notWin) {
                int dice = randomGenerator.nextInt(max);
                int dyse = randomGenerator.nextInt(max);
                if (dice == 1 && dyse == 1) {
                    notWin = false;
                } else {
                    score = score + dyse + dice;
                    rrollss++;
                }
                rolls++;
            }

            if (rrollss > 4) {
                overFour++;
            }

            rrollss = 0;
            i++;
            notWin = true;
        }

        int avRolls = (rolls/rounds);
        System.out.println("The average number of rolls: " + avRolls);

        int avScore = (score/rounds);
        System.out.println("The average score: " + avScore);

        double percent = ((overFour/rounds) * 100);
        System.out.println("The percent of rolls over 4: " + percent);
        
    }
}