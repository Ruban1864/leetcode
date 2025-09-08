class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = 1, b = n - 1;
        while (!isNonZero(a) || !isNonZero(b)) {
            a++;
            b--;
        }
        
        return new int[]{a, b};
    }

    private boolean isNonZero(int n) {
        while (n > 0) {
            if (n % 10 == 0) return false;  
            n /= 10;
        }
        return true;
    }
}
