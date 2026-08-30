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
        //If its normal BT then we can do this below approach, but as its a BST we can directly follow the path along the way finding predeceor and successor
        List<Integer> ans = Arrays.asList(-1,-1);
        inOrderTraversal(root,ans, key);
        return ans;
    }
    private void inOrderTraversal(TreeNode root, List<Integer> ans,int key){
        if(root == null) return;
        inOrderTraversal(root.left,ans,key);

        if(root.data < key){ ans.set(0,root.data);}
        // else if(root.data == key) {  }
        else if(root.data > key && ans.get(1) == -1){ ans.set(1,root.data); return;}
        // else{ return; }

        inOrderTraversal(root.right,ans,key);
    }
}