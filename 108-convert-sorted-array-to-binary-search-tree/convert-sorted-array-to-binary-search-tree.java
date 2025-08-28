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
    public TreeNode sortedArrayToBST(int[] nums) {
        return ishelper(nums,0,nums.length-1);
    }
    TreeNode ishelper(int[] a , int l , int r){
        if( l  > r) return null;

        int mid = l + (r - l) / 2;
        TreeNode nn = new TreeNode(a[mid]);
        nn.left = ishelper(a , l , mid - 1 );
        nn.right = ishelper( a , mid+1 , r );
        return nn;
    }
}