
public class SecondQue {

    public static int expectedNums(int [] nums, int val)
    {
        int count = 0;
        // Loop through all the elements of the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is not val
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] nums = { 3 , 2 , 2 , 3};
        int val = 3;
        
        System.out.println(expectedNums(nums, val));
        // System.out.println(Arrays.toString(nums));

    }
}
