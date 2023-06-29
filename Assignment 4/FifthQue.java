public class FifthQue {
    public static void main(String[] args) {
        int n = 5;
        int i = 1; // which row we are on

		while(n > 0){ // checking to see if we have used all our coins
			i++; // increasing our row
			n = n-i; // adding coins to our row
		}
		System.out.println(i-1);
    }
}
