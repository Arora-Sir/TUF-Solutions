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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findMaxPath(root);
        return maxSum;
    }
    public int findMaxPath(TreeNode root){
        if(root == null) return 0;
        int leftSum = Math.max(0,findMaxPath(root.left)); //negative sum dont consider
        int rightSum = Math.max(0,findMaxPath(root.right));

        maxSum = Math.max(maxSum, leftSum + root.data + rightSum); //Backtracking Logic: val+leftMaxSum+rightMaxSum

        return root.data + Math.max(leftSum,rightSum); //As we can either pick the left one or right one while returning to the parent above
    }
}