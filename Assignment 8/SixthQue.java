
import java.util.*;

class SixthQue {

    static void search(char[] pat, char[] txt) {

        int n = txt.length, m = pat.length;

        char[] sortedpat = pat;
        Arrays.sort(sortedpat);

        String temp;
        for (int i = 0; i <= n - m; i++) {
            temp = "";
            for (int k = i; k < m + i; k++)
                temp += txt[k];
            char tempArray[] = temp.toCharArray();
            Arrays.sort(tempArray);
            temp = new String(tempArray);

            if (String.valueOf(sortedpat).equals(temp))
                System.out.println("Found at Index " + i);
        }
    }

    public static void main(String[] args) {
        String txt = "cbaebabacd";
        String pat = "abc";
        search(pat.toCharArray(), txt.toCharArray());
    }
}
