import java.util.Arrays;

public class FifthQue {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3; 
        int []nums2 = {2,5,6};
        int n = 3;

        int [] num = new int[m+n];
        int k=0;

        for(int i=0; i<=nums1.length-1; i++)
        {
            for(int j=i+1; i<=nums2.length; i++)
            {
                if(nums1[i] <= nums2[j])
                {
                    num[k] = nums1[i];
                    k++;
                }
                else{
                    num[k] = nums2[j];
                    k++;
                }
            }
        }

        System.out.println(Arrays.toString(num));
    }
}
