import java.util.Arrays;
import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        for (int i=0; i<nums.size()/2; i++) {
            int temp = nums.get(i);
            nums.set(i, nums.get(nums.size()-i-1));
            nums.set(nums.size()-i-1, temp);
        }
        
        for (int n:nums) {
            System.out.print(n + " ");
        }
    }
}