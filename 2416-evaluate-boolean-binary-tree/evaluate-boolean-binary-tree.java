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
    public boolean evaluateTree(TreeNode root) {
        if(root == null ) return false;
        return helper(root);
    }
    private boolean helper(TreeNode root){
        if( root.val == 1 ) return true;
        if( root.val == 0 ) return false;
        boolean left = helper(root.left);
        boolean right = helper(root.right);
        if (root.val == 3 ) return left && right;
        return left || right ;
    }
}