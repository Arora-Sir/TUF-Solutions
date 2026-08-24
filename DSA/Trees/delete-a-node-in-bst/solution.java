/**
 * Definition for a binary tree node. public class TreeNode { int data; TreeNode left; TreeNode
 * right; TreeNode(int val) { data = val; left = null, right = null } }
 */
class Solution {
  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) return null;

    TreeNode currDelete = root;
    TreeNode parentDelete = null; //parent of current deletion node

    while (currDelete != null && currDelete.data != key) {
      parentDelete = currDelete;

      if (key < currDelete.data) {
        currDelete = currDelete.left;
      } else {
        currDelete = currDelete.right;
      }
    }

    if (currDelete == null) return root; // key not exists

    //if currDelete has 0 or 1 child we can directly replace it with its child
    if (currDelete.left == null || currDelete.right == null) {
      TreeNode child = (currDelete.left != null) ? currDelete.left : currDelete.right;

      if (parentDelete == null) return child; //if we are at root

      if (parentDelete.left == currDelete) { //as we have only 1 child max
        parentDelete.left = child;
      } else {
        parentDelete.right = child;
      }

      return root;
    }

    //now if both child exists of the currDelete that we want to delete
    TreeNode parentEnd = currDelete;
    TreeNode currEnd = currDelete.left;

    while (currEnd.right != null) { //inorder predecessor: largest value in left subtree
      parentEnd = currEnd;
      currEnd = currEnd.right;
    }

    currDelete.data = currEnd.data;

    if (parentEnd.right == currEnd) {
      parentEnd.right = currEnd.left; // as left could have exists of the right most child of left sub tree
    } else {
      parentEnd.left = currEnd.left; //direct left child of currDelete case (as no right exists of this subtree basically)
    }

    return root;
  }
}