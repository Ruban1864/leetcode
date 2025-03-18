class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1, right = x, ans = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == x) return (int) mid;
            if (mid * mid < x) {
                ans = (int) mid;
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }
        return ans;
    }
}
