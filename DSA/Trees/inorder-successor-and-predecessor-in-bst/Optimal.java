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
    List<Integer> succPredBST(TreeNode root, int key) {
        List<Integer> ans = Arrays.asList(-1, -1);
        TreeNode curr = root;
        while (curr != null) {
            if (curr.data < key) { // current node can be a predecessor
                ans.set(0, curr.data); 
                curr = curr.right;
            }
            else if (curr.data > key) { // current node can be a successor
                ans.set(1, curr.data);
                curr = curr.left;
            }
            else {
                TreeNode temp = curr.left;
                while (temp != null) { // predecessor: rightmost node in left subtree
                    ans.set(0, temp.data);
                    temp = temp.right;
                }

                temp = curr.right;
                while (temp != null) { // successor: leftmost node in right subtree.
                    ans.set(1, temp.data);
                    temp = temp.left;
                }
                break;
            }
        }
        return ans;
    }
}