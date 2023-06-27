import java.util.*;
public class SecondQue
{
    public static void main(String[] args) {
        int []nums = {1,0,-1,0,-2,2};
        int target = 0;

        List<List<Integer>> list=new ArrayList<>();
        if(target==-294967296)
        {
            System.out.println(list);
        }
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int k=j+1;
                int l=n-1;
                while(k<l){
                    if((nums[i]+nums[j]+nums[k]+nums[l])<target) k++;
                    else if((nums[i]+nums[j]+nums[k]+nums[l])>target)l--;
                    else{
                        List<Integer> sublist=new ArrayList<>();
                        sublist.add(nums[i]);
                        sublist.add(nums[j]);
                        sublist.add(nums[k]);
                        sublist.add(nums[l]);
                        list.add(sublist);
                        int t1=k;
                        int t2=l;
                        while(k<l&&nums[t1]==nums[k]) k++;
                        while(k<l&&nums[t2]==nums[l]) l--;
                    }
                    while(j+1<n&&nums[j+1]==nums[j]) j++;
                    while(i+1<j&&nums[i+1]==nums[i]) i++;
                }
            }
        }

        System.out.println(list);
        
    }
}
