public class QueFive {
      public static String reverseStr(String s, int k) {
        int i=0;

    String ans="";

    while(i<s.length()){
    if(i+(2*k)-1<s.length()||i+(2*k)-1>=s.length()&&s.length()-i>=k){
    int index=i+(2*k)-1;
    StringBuilder str=new StringBuilder();
    String app=s.substring(i,i+k);
    str.append(app);
    str.reverse();
    ans+=str.toString();
    i=i+k;
    while(i<s.length()&&i<=index){
        ans+=s.charAt(i);
        i++;
    }
    }
    else{ 
    StringBuilder temp2=new StringBuilder();
    temp2.append(s.substring(i,s.length()));
    temp2.reverse();
    ans+=temp2.toString();
    break;
    }
    }
    return ans;
    }
    public static void main(String[] args)
    {
        String s = "abcdefg";
         int k = 2;
        System.out.print(reverseStr(s , k));
    } 
}
