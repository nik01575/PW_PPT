import java.util.Arrays;

public class EightQue {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };

        Arrays.sort(nums);
        int missing = 1;    

        // find missing no

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == missing) {
                missing++;
            }
        }

        // find duplicate

        int dup = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                dup = nums[i];
            }
        }

        System.out.println( "[ " + dup + " , " + missing + " ]");
    }
}
