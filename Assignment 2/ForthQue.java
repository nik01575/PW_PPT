public class ForthQue {
    public static boolean isflowerbed(int flowerbed[] , int n)
    {
        if (n==0) 
        return true;

        for (int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 && (i==0||flowerbed[i-1]==0) &&
              (i==flowerbed.length-1 || flowerbed[i+1]==0))
            {
                n--;
                if (n==0) 
                return true;
                flowerbed[i]=1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int flowerbed[] = {1,0,0,0,1};
        int no=2;

        System.out.println(isflowerbed(flowerbed, no));
    }
}
