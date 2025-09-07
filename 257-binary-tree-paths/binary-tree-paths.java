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
    List<String> ans;

    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        if (root == null) return ans;
        ishelper(root, "");
        return ans;
    }

    public void ishelper(TreeNode root, String s) {
        if (root == null) return;

        // build current path
        if (s.isEmpty()) {
            s = Integer.toString(root.val);
        } else {
            s = s + "->" + root.val;
        }

        // if leaf node → add path
        if (root.left == null && root.right == null) {
            ans.add(s);
            return;
        }

        // recurse on children
        ishelper(root.left, s);
        ishelper(root.right, s);
    }
}
