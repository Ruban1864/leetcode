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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        helper(root, targetSum, currentPath, result);
        return result;
    }
    private void helper(TreeNode node, int targetSum, List<Integer> path, List<List<Integer>> result) {
        if (node == null) return;
        path.add(node.val);
        if (node.left == null && node.right == null && targetSum == node.val) {
            result.add(new ArrayList<>(path));
        } else {
            helper(node.left, targetSum - node.val, path, result);
            helper(node.right, targetSum - node.val, path, result);
        }
        path.remove(path.size() - 1);
    }
}
