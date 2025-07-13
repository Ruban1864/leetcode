class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> input = new HashSet<>();
        HashSet<Integer> result = new HashSet<>(); 

        for(int num : nums1){
            input.add(num);
        }

        for(int num : nums2){
            if(input.contains(num)){
                result.add(num);
            }
        }
        
        int[] res = new int[result.size()];
        int index=0;
        for(int num : result ){
            res[index++] = num;
        }
        return res;
    }
}