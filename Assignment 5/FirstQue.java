public class FirstQue
{
    public static void main(String[] args) {
        int[] original= {1,2,3,4};
        int m = 2;
        int n = 2;

        if (m * n != original.length) {
            System.out.println(new int[0][0]);
        }
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                ans[i][j] = original[i * n + j];
            }
        }

         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }   
}