/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<Integer>();
    //base case 是叶下面的空指针
    if (root == null) {
        return new ArrayList<Integer>();
    }
	Stack<TreeNode> helper = new Stack<>();
	TreeNode curr = root;
// 	helper.push(curr);
	while (!helper.isEmpty() || curr != null) {
		while (curr != null) {
	        helper.push(curr);
	        curr = curr.left;
        }
        curr = helper.pop();
        result.add(curr.val);
        curr = curr.right;
    }
    return result;
  }
}