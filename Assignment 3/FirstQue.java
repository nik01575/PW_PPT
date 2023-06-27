import java.util.Arrays;

public class FirstQue {
        public static int threeSumClosest(int[] nums, int target) {
            int n = nums.length;

            // Sort - nlogn
            Arrays.sort(nums);

            // Two pointer closing with fixed element
            int closest = Integer.MAX_VALUE;

            for (int i = 0; i <= n - 3; i++) {
                int left = i + 1;
                int right = n - 1;

                while (left < right) {
                    int current_triplet_sum = nums[i] + nums[left] + nums[right];

                    // Update
                    if (Math.abs(target - closest) > Math.abs(target - current_triplet_sum)) {
                        closest = current_triplet_sum;
                    }

                    // Move pointers
                    if (current_triplet_sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }

            return closest;
        }

    public static void main(String[] args) {
        int []nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums , target));
    }
}