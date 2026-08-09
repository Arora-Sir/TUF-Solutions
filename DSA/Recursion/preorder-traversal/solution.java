/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public List<Integer> preorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorderHelper(root, ans);
        return ans;
    }

    private void preorderHelper(TreeNode node, List<Integer> ans) {
        if (node == null) return;
        ans.add(node.data);
        preorderHelper(node.left, ans);
        preorderHelper(node.right, ans);
    }
}