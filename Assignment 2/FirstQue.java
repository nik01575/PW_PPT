import java.util.Arrays;

public class FirstQue
{
    public static void main(String[] args) {
        int [] nums = {1,4,3,2 };  // 1 2 3 4
        Arrays.sort(nums);
        int sum=0;

        for(int i=0; i<nums.length-1; i=i+2)
        {
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
}