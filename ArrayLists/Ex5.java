import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Ex5 {
    public static void main (String [] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List<List<Integer>> coords = new ArrayList<List<Integer>>();

        for (int i=0; i<nums.size()-1; i++) {
            List<Integer> temp = new ArrayList<> (Arrays.asList(nums.get(i), nums.get(i+1)));
            coords.add(temp);
            i++;
        }

        System.out.print(coords);
    }

}