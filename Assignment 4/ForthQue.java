import java.util.Arrays;

public class ForthQue {
    public static void main(String[] args) {
        int []nums = {1,4,3,2};  // 1 2 3 4

        Arrays.sort(nums);
        int sum=0;

        for(int i=0; i<nums.length-1; i=i+2)
        {
            sum = sum + Math.min(nums[i], nums[i+1]);
        }
        System.out.println(sum);
    }
}
