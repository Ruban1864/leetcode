class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    ishelper(grid, i, j); // Pass current cell (i, j)
                    count++;
                }
            }
        }
        return count;
    }

    private void ishelper(char[][] a, int r, int c) {
        // Check bounds and if cell is water or visited
        if (r < 0 || r >= a.length || c < 0 || c >= a[0].length || a[r][c] == '0') {
            return;
        }

        a[r][c] = '0'; // Mark as visited
        // Explore all four directions
        ishelper(a, r - 1, c); // Up
        ishelper(a, r + 1, c); // Down
        ishelper(a, r, c - 1); // Left
        ishelper(a, r, c + 1); // Right
    }
}