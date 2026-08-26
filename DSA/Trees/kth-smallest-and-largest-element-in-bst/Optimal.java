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
    public List<Integer> kLargesSmall(TreeNode root, int k) {
        // Optimal: Inorder -> nomral kth smallest & reverse for kth largest.

        int[] smallest = {0, 0}; //count for kth number, ans
        int[] largest = {0, 0};

        //inorder traversals
        findKth(root, k, smallest, true); //left -> root -> right
        findKth(root, k, largest, false); //right -> root -> left

        return Arrays.asList(smallest[1], largest[1]);
    }

    private void findKth(TreeNode root, int k, int[] result, boolean smallest) {
        if (root == null || result[0] >= k) return;

        if (smallest) findKth(root.left, k, result, true);
        else findKth(root.right, k, result, false);

        result[0]++;
        if (result[0] == k) {
            result[1] = root.data;
            return;
        }

        if (smallest) findKth(root.right, k, result, true);
        else findKth(root.left, k, result, false);
    }
}