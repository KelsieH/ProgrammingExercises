import java.util.Arrays;
import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("apples", "pears", "mangos", "bananas", "watermelons", "grapes", "cherries", "strawberries", "oranges", "lemons"));
        ArrayList<String> froots = new ArrayList<String>(Arrays.asList("apples", "pears", "peaches", "bananas", "watermelons", "avocado", "raspberries", "blueberries", "oranges", "lychee"));

        ArrayList<String> sorted = new ArrayList<String>();
        sorted.addAll(fruits);
        sorted.retainAll(froots);

        for (String n : sorted) {
            System.out.print(n + " ");
        }
    }
}