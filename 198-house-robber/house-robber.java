class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        
        int[] value = new int[n];
        value[0] = nums[0];
        if (n > 1) {
            value[1] = Math.max(nums[0], nums[1]);
        }
        
        for (int i = 2; i < n; i++) {
            int rob = nums[i] + value[i-2];
            int skip = value[i-1];
            value[i] = Math.max(rob, skip);
        }
        
        return value[n-1];
    }
}