class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        backtrack(nums , vis , new ArrayList<>() , res );
        return res;
    }
    private void backtrack(int[] nums , boolean[] vis , List<Integer> curr , List<List<Integer>> res){
        if( curr.size() == nums.length ){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i < nums.length ; i++){
            if(vis[i]) continue;

            vis[i] = true;
            curr.add(nums[i]);

            backtrack( nums , vis , curr , res);

            curr.remove(curr.size() - 1);
            vis[i] = false;
        }
    }
    
}