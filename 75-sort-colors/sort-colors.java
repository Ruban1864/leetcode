class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int key ;
        for(int i = 1 ; i < n ; i++ ){
            key = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j] > key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        for(int num : nums){
            System.out.print("");
        }
    }
}