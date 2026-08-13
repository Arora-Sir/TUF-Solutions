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
    public List<Integer> postorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorderHelper(root, ans);
        return ans;
    }

    private void postorderHelper(TreeNode node, List<Integer> ans) {
        if (node == null) return; 
        postorderHelper(node.left, ans);
        postorderHelper(node.right, ans);
        ans.add(node.data);
    }
}