class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int max = 0;
        for(int i = 0 ; i < r ; i++ ){
            for(int j= 0 ; j < c ; j++ ){
                if(grid[i][j] == 1){
                    int count = ishelper(grid, i, j);
                    max = max > count ? max : count;
                }
            }
        }   
        return max;
    }
    private int ishelper(int[][] a , int r , int c){
        if( r < 0 || r >= a.length || c < 0 || c >= a[0].length || a[r][c] == 0 )
            return 0;
        
        int area = 1;
        a[r][c] = 0;
        area += ishelper(a, r-1, c);
        area += ishelper(a, r+1, c);
        area += ishelper(a, r, c - 1);
        area += ishelper(a, r, c + 1);
        return area;
    }
}