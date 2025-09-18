class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> mE = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int pos = nums[i] - 1;
            if(nums[i] != nums[pos]){
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
            }
            else{
                i++;
            }
        }
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                mE.add(j+1);   
            }
        }
        return mE;
    }
} 