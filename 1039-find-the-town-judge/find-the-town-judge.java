class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] count = new int[n + 1];

        for (int[] t : trust) {
            count[t[0]]--;  // trusting someone → lose score
            count[t[1]]++;  // being trusted → gain score
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}
