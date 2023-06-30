public class SeventhQue {
    public static void main(String[] args) {
        int nums[]= {3,4,5,1,2};

        int l=0;
        int h=nums.length-1;

        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            if(nums[mid]>nums[h])
                l=mid+1;
            else
                h=mid;
        }
        System.out.println(nums[h]);
    }
}
