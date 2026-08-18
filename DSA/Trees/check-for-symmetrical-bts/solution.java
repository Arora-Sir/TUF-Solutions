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
    public boolean isSymmetric(TreeNode root) {
        return ((root==null) || (isSymmetricHelper(root.left,root.right)));
    }
    public boolean isSymmetricHelper(TreeNode rootLeft, TreeNode rootRight){
        if(rootLeft==null || rootRight==null) return rootLeft==rootRight;
        if(rootLeft.data != rootRight.data) return false;
        return isSymmetricHelper(rootLeft.left,rootRight.right) && isSymmetricHelper(rootLeft.right,rootRight.left);
    }
}