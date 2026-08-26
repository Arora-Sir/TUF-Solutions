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
        // Brute: DFS (pre/in/post order traversal) all nodes -> store in a list -> sort it -> then return the kth smallest and kth largest elements. O(nlogn) & O(n)
        //Better: Directly use the inorder traversal so that there is no need of sorting it. O(n) & O(n)

        List<Integer> list = new ArrayList<>();
        dfs(root, list); //inorder traversal

        // Collections.sort(list);

        int kthSmallest = list.get(k - 1);
        int kthLargest = list.get(list.size() - k);

        return Arrays.asList(kthSmallest, kthLargest);
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root == null) return;
        dfs(root.left, list);
        list.add(root.data);
        dfs(root.right, list);
    }
}