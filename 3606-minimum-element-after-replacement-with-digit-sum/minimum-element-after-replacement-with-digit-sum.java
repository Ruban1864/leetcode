class Solution {
    public int minElement(int[] nums) {
        int min = nums[0];
        for(int num : nums){
            int newSum = digitSum(num);
            if( newSum < min){
                min = newSum;
            }
        }
        return min;
    }

    private int digitSum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}