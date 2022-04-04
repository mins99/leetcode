/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> result = new ArrayList<Integer>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        
        return result;
    }
    
    public void postOrder(TreeNode node) {
		if(node != null) {
			if(node.left != null) {
                postOrder(node.left);
            }
            
			if(node.right != null) {
                postOrder(node.right);
            }
            
            result.add(node.val);
		}
	}
}