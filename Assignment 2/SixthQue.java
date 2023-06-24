public class SixthQue {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;

        int start =0;
        int end = nums.length-1;
        int mid = (start+end)/2;

        while(start<=end)
        {
            if(nums[mid] == target)
            {
                System.out.println("Element found at index " + mid);
                break;
            }
            else if(nums[mid] < target)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
            mid = (start+end)/2;

        }
        if(start > end)
        {
            System.out.println("Element not found");
        }
    }
}
