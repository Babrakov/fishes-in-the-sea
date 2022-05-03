public class FishesInTheSea {

    public int solve(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int sum = matrix[0][0];
        // Check the first column for the maximum value
        int targetRow = 0;
        for (int i = 1; i < rows; i++) {
            if (sum<matrix[i][0]) {
                sum = matrix[i][0];
                targetRow = i;
            }
        }
        // Go through all the remaining columns
        for (int i = 1; i < cols; i++) {
            int currentRow = targetRow;
            int max = 0;
            // Check if right-up(↗) value is the max
            if (currentRow>0 && max<matrix[currentRow-1][i]) {
                max = matrix[currentRow-1][i];
                targetRow = currentRow-1;
            }
            // Check if right(→) value is the max
            if (max<matrix[currentRow][i]) {
                max = matrix[currentRow][i];
                targetRow = currentRow;
            }
            // Check if right-down(↘) value is the max
            if (currentRow<rows-1 && max<matrix[currentRow+1][i]) {
                max = matrix[currentRow+1][i];
                targetRow = currentRow+1;
            }
            sum += max;
        }
        return sum;
    }

}
