public class ThirdQue {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // row
        int m = matrix.length;
        // col
        int n = matrix[0].length;
        // new arr
        int[][] result = new int[n][m];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                result[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
