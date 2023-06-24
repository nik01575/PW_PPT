import java.util.Arrays;

public class EightQue {

    public static int range(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = (nums[nums.length-1]-k) - (nums[0]+k);
        if(ans<0)
            return 0;
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {1};
        int k = 0;

        System.out.println(range(nums, k));
    }
}
