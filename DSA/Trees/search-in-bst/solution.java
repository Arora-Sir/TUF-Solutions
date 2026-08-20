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
    public TreeNode searchBST(TreeNode root, int val) {
       if(root==null) return null;
       if(root.data == val) return root;
       else if(root.data > val) root = root.left;
       else  root = root.right;
       TreeNode ans = searchBST(root,val);
       return ans;
    }
}