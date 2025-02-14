class Solution {
   public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();  // Stores frequency of each number
        int count = 0;  // Keeps track of the number of valid pairs

        for (int num : nums) {  // Iterate through each number in the array
            int complement = k - num;  // Find the complement that forms sum k

            if (map.getOrDefault(complement, 0) > 0) {  // If complement exists in map
                count++;  // A valid pair is found
                map.put(complement, map.get(complement) - 1);  // Decrease frequency of complement
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);  // Store num in map
            }
        }
        return count;  // Return total valid pairs
    }
}