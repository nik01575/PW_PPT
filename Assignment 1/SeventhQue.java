import java.util.Arrays;

public class SeventhQue {
    public static void main(String[] args) {
        int []arr = {0,1,0,3,12};


        for(int i=0; i< arr.length-1; i++)
        {
            for(int j=i+1; j< arr.length ; j++)
            {
                if(arr[i] == 0)
                {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
