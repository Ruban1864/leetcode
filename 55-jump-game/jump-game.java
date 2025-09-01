class Solution {
   public boolean canJump(int[] nums) {
    int longest = 0;

    for(int i = 0 ; i < nums.length ; i++){
        if( i > longest ) return false;
        longest = Math.max( longest , i + nums[i] );
    }
    return true;
   }
}         