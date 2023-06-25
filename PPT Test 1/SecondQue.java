import java.util.HashMap;

public class SecondQue {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++)
        {
            if(mp.containsKey(s.charAt(i)))
            {
                mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
            }
            else
            {
                mp.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(mp.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
