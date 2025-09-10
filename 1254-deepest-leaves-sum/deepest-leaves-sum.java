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
    public int deepestLeavesSum(TreeNode root) {
        int Height = maxHeight(root);
        return depthSum(root ,1 ,Height );
    }
    private int maxHeight(TreeNode root){
        if( root == null ) return 0;
        return Math.max( maxHeight(root.left) , maxHeight(root.right) ) + 1;
    }
    private int depthSum(TreeNode root , int depth , int maxDepth){
        if( root == null ) return 0;
        if( depth == maxDepth ) return root.val;
        return depthSum( root.left , depth + 1 , maxDepth ) +
                depthSum( root.right , depth + 1 , maxDepth );
    }
}