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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode prev = root;
        TreeNode curr = root;
        while(curr!=null){ 
            prev = curr;
            if(curr.data < val) curr = curr.right;
            else curr = curr.left;
        }
        if(prev.data < val) prev.right = new TreeNode(val);
        else prev.left = new TreeNode(val);
        return root;
    }   
}