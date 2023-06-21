public class ThirdQue {

    public static int output(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 9 };
        int target = 8;

        System.out.println(output(nums, target));
    }
}
