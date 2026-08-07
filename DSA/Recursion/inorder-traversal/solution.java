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
    public List<Integer> inorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorderHelper(root, ans);
        return ans;
    }

    private void inorderHelper(TreeNode node, List<Integer> ans) {
        if (node == null) return;
        inorderHelper(node.left, ans);
        ans.add(node.data);
        inorderHelper(node.right, ans);
    }
}