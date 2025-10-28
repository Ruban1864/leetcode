class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int start = nums[0];  // start of current range

        for (int i = 1; i <= nums.length; i++) {
            // If we're at the end or the next number is not consecutive
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                int end = nums[i - 1];
                if (start == end) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + end);
                }
                // start a new range if not at end
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return result;
    }
}