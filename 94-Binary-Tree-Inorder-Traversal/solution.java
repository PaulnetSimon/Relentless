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
	helper.push(curr);
	curr = curr.left;
	while (!helper.isEmpty()) {
		while (curr.left != null) {
	        helper.push(curr);
        }
        curr = helper.pop();
        System.out.println(“ ” + curr.key);
        curr = curr.right;
    // 这里有问题, 应该是每次一往右走之后马上再检查左边的情况
        if (curr != null) {
        	helper.push(curr);
        }
    }
  }
}