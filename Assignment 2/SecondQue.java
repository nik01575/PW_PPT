import java.util.*;

public class SecondQue {
    public static void main(String[] args) {

        int [] candyType = {6,6,6,6};
        Set<Integer> set = new HashSet<>();

        // for(int i=0; i < candyType.length; i++)
        for (int i : candyType)
        {
            //set.add(candyType[i]);
            set.add(i);
        } 
        System.out.println(Math.min(set.size() , candyType.length/2)); 
    }
}
