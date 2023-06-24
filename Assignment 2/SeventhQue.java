public class SeventhQue {

    public static boolean monotonic(int [] nums)
    {
        int count=0;
        int count1=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<=nums[i+1]){
                count++;
            }
            if(nums[i]>=nums[i+1]) {
                count1++;
            }
        }
        return count==nums.length-1 || count1==nums.length-1;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,1,3};

        System.out.println(monotonic(nums));
    }
}
    