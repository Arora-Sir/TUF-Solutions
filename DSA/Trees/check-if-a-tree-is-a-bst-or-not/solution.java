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
    public boolean isBST(TreeNode root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isBST(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.data <= min || root.data >= max) return false;

        return isBST(root.left, min, root.data) &&
               isBST(root.right, root.data, max);
    }
}