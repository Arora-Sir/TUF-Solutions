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
    public TreeNode lca(TreeNode root, int p, int q) {
        // if((root.data>p && root.data<q) || (root.data<p && root.data>q)) return root;
        if (root == null) return null; //ancestor not found
        if(p<root.data && q<root.data) return lca(root.left,p,q);
        if(p>root.data && q>root.data) return lca(root.right,p,q);
        return root; //this can already handles the top commented statement

        //Below is the Binary Tree Solution (not BST)
        // if (root == null || root.data == p || root.data == q) return root;
        // TreeNode left = lca(root.left, p, q);
        // TreeNode right = lca(root.right, p, q);
        // if (left != null && right != null) return root; //Different sides
        // if (left != null) return left; //Both same side
        // return right;
    }
}