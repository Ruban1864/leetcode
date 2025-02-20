class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for(int num : nums )
            s.add(num);
        
        int result = 0;
        for( int num : nums){
            int currenstreak = 0;
            while(s.contains(num) && !s.contains(num+1)){
                currenstreak++;
                s.remove(num);
                num--;
            }
            result = Math.max(result,currenstreak);
        }
        return result;

        
    }
}