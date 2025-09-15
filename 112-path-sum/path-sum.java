/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if( root == null ) return false;
        return ishelper(root,targetSum);
    }
    private boolean ishelper(TreeNode root , int target ){
        if(root == null) return false;
        target -= root.val;
        if(root.left == null && root.right == null) {
            if(target == 0) return true;
        }
        return ishelper(root.left,target) || ishelper(root.right,target);
    }
}