import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Ex3 {
    public static void main( String[] args ) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(2, 5, 17, 19, 21, 28, 45, 71, 90));
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        int newnum = 7;

        for (int i=0; i<nums.size(); i++) {
            if (nums.get(i) < newnum && nums.get(i+1) > newnum) {
                newlist.add(nums.get(i));
                newlist.add(newnum);
            } else {
                newlist.add(nums.get(i));
            }
        }
        Collections.sort(newlist);

        for (int n : newlist) {
            System.out.print(n + " ");
        }
    }
}