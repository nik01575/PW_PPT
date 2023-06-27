public class SixthQue {
    public static void main(String[] args) {
        // solved with XOR; when the same number is XORed, the result is 0. 
        // just loop through the elements and XOR them; the non repeating number remains.

        int nums[] = {2,2,1};
        int ans =0;
        int i=0;
        
        while(i<=nums.length-1)
        {
            ans=ans^nums[i];
            i++;
        }
        System.out.println(ans);
    
    }
}
