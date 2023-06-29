import java.util.*;

public class EightQue {

    public static void shuffle(int[] nums, int n) {
        int[] a = new int[2*n];
        int i=0,j;

        for(j=0; j<2*n; j+=2){ //2 3 5 4 1 7
            a[j] = nums[i];
            a[j+1] = nums[i+n];
            i++;
        }
        
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int n = 3;
        
        shuffle(nums, n);
    }
}
