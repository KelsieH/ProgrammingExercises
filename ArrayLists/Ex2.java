import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2 { 
    public static void main( String[] args ) {
        ArrayList<String> animals = new ArrayList<String>(Arrays.asList("dogs", "cats", "parrots", "dogs", "rabbits", "tigers", "rats", "bears", "bears", "tigers"));
        Collections.sort(animals);

        for (int i=1; i<animals.size() -1; i++) {
            if (animals.get(i).equals(animals.get(i-1))) {
                animals.remove(i-1);
            }
        }
        
        for (String n : animals) {
            System.out.println(n);
        }
    }
}