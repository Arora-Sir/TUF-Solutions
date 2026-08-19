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
    private int height(TreeNode root){
        if(root == null) return 0;
        
        int leftHeight = height(root.left);
        if (leftHeight == -1) return -1; 

        int rightHeight = height(root.right);
        if (rightHeight == -1) return -1; 

        int diff = Math.abs(leftHeight-rightHeight);
        if(diff>1) return -1;
        return 1+Math.max(leftHeight,rightHeight);
    }
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
	}
}