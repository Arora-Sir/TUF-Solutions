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
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        if(n==0) return null;

        //array , upperBound, to share common index (or global variable)
        return bstFromPreorderHelper(preorder, Integer.MAX_VALUE, new int[]{0});
    }

    private TreeNode bstFromPreorderHelper(int[] preorder, int bound, int[] index) {
        //use all the elements or index > bound
        if (index[0] == preorder.length || preorder[index[0]] > bound) return null;

        //root -> left -> right
        TreeNode root = new TreeNode(preorder[index[0]++]);
        root.left = bstFromPreorderHelper(preorder, root.data, index); //left < root i.e root becomes the upper bound
        root.right = bstFromPreorderHelper(preorder, bound, index); //right > bound of the root
        return root;
    }
}