class Solution {
    public int pivotIndex(int[] nums) {
        int sums=0;
        for(int i = 0 ; i < nums.length ; i++){
            sums += nums[i];
        }
        int leftsum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(leftsum == (sums - leftsum - nums[i])){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}