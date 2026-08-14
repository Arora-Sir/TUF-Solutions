/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int data) { data = data; left = null, right = null }
 * }
 **/

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0; 
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1+Math.max(left,right);
    }
}