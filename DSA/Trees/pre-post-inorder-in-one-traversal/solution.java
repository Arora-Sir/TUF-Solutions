/**
 * Definition for a binary tree node. public class TreeNode { int data; TreeNode left; TreeNode
 * right; TreeNode(int val) { data = val; left = null, right = null } }
 */
class Solution {
  class Pair {
    TreeNode node;
    int num;

    Pair(TreeNode node, int num) {
      this.node = node;
      this.num = num;
    }
  }

  List<List<Integer>> treeTraversal(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();

    List<Integer> pre = new ArrayList<>();
    List<Integer> in = new ArrayList<>();
    List<Integer> post = new ArrayList<>();

    if (root == null) {
      ans.add(pre); ans.add(in); ans.add(post);
      return ans; //or return `Arrays.asList(in,pre,post);`
    }

    Stack<Pair> st = new Stack<Pair>();
    st.push(new Pair(root, 1));

    while (!st.isEmpty()) {
      Pair it = st.pop();
      if (it.num == 1) { // num == 1 means this is the PREORDER stage
        pre.add(it.node.data);
        it.num++;  // Move this node to its INORDER stage
        st.push(it);  // Put it back so we can process it again later
        if (it.node.left != null) {  // Process the left subtree next
          st.push(new Pair(it.node.left, 1));
        }
      } else if (it.num == 2) { // num == 2 means this is the INORDER stage
        in.add(it.node.data);
        it.num++; // Move this node to its POSTORDER stage
        st.push(it); // Put it back so we can process it again later
        if (it.node.right != null) { // Process the right subtree next
          st.push(new Pair(it.node.right, 1));
        }
      } else { // num == 3 means this is the POSTORDER stage.
        post.add(it.node.data);
      }
    }

    ans.add(in); ans.add(pre); ans.add(post);
    return ans; //return `Arrays.asList(in,pre,post);`
  }
}
