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
    public boolean isSameTree(TreeNode p, TreeNode q) { 
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.data!=q.data) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}