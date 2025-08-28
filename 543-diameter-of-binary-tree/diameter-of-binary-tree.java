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
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        ishelper(root);
        return res;
    }
    public int ishelper(TreeNode root){
        if(root == null) return 0;
        int left = ishelper(root.left);
        int right = ishelper(root.right);
        int max = left > right ? left : right;
        int xyz = left + right;
        res = res > xyz ? res : xyz;
        return max+1;
    }
}