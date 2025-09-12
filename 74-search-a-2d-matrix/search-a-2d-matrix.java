class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Go row by row
        for (int i = 0; i < m; i++) {
            if (findTarget(matrix[i], n, target)) {
                return true;
            }
        }
        return false;
    }

    // Binary search in a row
    private boolean findTarget(int[] row, int n, int target) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (row[mid] == target) return true;
            else if (row[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}