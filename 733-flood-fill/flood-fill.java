class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        if (startColor == color) return image;
        ishelper(image, sr, sc, startColor, color);
        return image;
    }

    private void ishelper(int[][] im, int r, int c, int oldColor, int newColor) {
        if (r < 0 || r >= im.length || c < 0 || c >= im[0].length || im[r][c] != oldColor) {
            return;
        }
        im[r][c] = newColor;
        ishelper(im, r - 1, c, oldColor, newColor);
        ishelper(im, r + 1, c, oldColor, newColor);
        ishelper(im, r, c - 1, oldColor, newColor);
        ishelper(im, r, c + 1, oldColor, newColor);
    }
}