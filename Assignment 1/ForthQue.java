import java.util.Arrays;

public class ForthQue {
    public static int[] sol(int[] digits)
    {
         for(int i=digits.length-1; i>=0; i--)
        {
            if(digits[i] != 9)
            {
                digits[i]++;
                break;
            }
            else
            {
                digits[i] =0;
            }
        }
        if(digits[0] == 0)
        {
            int [] result = new int[digits.length+1];
            result[0] =1;
            return result;
        }
        return digits;
    }
    public static void main(String[] args) {
        int [] digits = {1,2,3};

       System.out.println(Arrays.toString(sol(digits)));
    }
}
