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
    public List<Integer> floorCeilOfBST(TreeNode root, int key) {
        List<Integer> ans = new ArrayList<>(List.of(-1, -1));
        TreeNode pointer = root;
        while (pointer != null) {
            if (pointer.data < key) {
                ans.set(0, pointer.data);
                pointer = pointer.right;
            } else if (pointer.data > key) {
                ans.set(1, pointer.data);
                pointer = pointer.left;
            } else {
                ans.set(0, pointer.data);
                ans.set(1, pointer.data);
                break;
            }
        }
        return ans;
    }
}