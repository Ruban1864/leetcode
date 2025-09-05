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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Inorder(root1,list1);
        Inorder(root2,list2);
        return merge(list1,list2);
    }

    private void Inorder(TreeNode root , List<Integer> list){
        if(root != null){
            Inorder(root.left , list);
            list.add(root.val );
            Inorder(root.right , list);
        }
        return ;
    }

   private List<Integer> merge(List<Integer> list1, List<Integer> list2) {
    List<Integer> res = new ArrayList<>();
    int i = 0, j = 0;

    while (i < list1.size() && j < list2.size()) {
        if (list1.get(i) < list2.get(j)) {
            res.add(list1.get(i++));
        } else {
            res.add(list2.get(j++));
        }
    }

    while (i < list1.size()) {
        res.add(list1.get(i++));
    }

    while (j < list2.size()) {
        res.add(list2.get(j++));
    }

    return res;
}
}