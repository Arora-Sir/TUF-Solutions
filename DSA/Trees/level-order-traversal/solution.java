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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> levelQueue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        levelQueue.add(root);
        while(!levelQueue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = levelQueue.size(); //As the size will change as we move into the below loop
            for(int i=0;i<size;i++){
                TreeNode node = levelQueue.poll();
                level.add(node.data); 
                if(node.left!=null) levelQueue.add(node.left);
                if(node.right!=null) levelQueue.add(node.right);
            }
            ans.add(level); 
        }
        return ans;
    }
}