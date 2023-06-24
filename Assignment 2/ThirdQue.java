import java.util.*;

public class ThirdQue {

    public static int findMaxArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int current = 0;
        int next = 1;
        int maxLength = 0;
        
        while (next < nums.length) {
            int difference = nums[next] - nums[current];
            if (difference == 1) {
                maxLength = Math.max(maxLength, next - current + 1);
            }
            if (difference <= 1) {
                next++;
            } else {
                current++;
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        int [] nums = {1,3,2,2,5,2,3,7};   // 1 2 2 2 3 3 5 7
       
        System.out.println(findMaxArray(nums));
        
    }
}
