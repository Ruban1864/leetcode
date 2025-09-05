class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return ishelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean ishelper(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false;
        return ishelper(root.left, min, root.val) &&
               ishelper(root.right, root.val, max);
    }
}
