class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] st = new int[n+1];
        int x = -1;
        int max = 0;

        for(int i = 0; i <= n ;i++){
            int curr = (i == n) ? 0 : heights[i];
            while( x != -1 && curr < heights[st[x]]){
                int h = heights[st[x--]];
                int w = ( x==-1) ? i : i-st[x]-1;
                int area = h*w;
                max = (area > max) ? area : max;
            }
            st[++x]=i;
        }
        return max; 
    }
}