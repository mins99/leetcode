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
        
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        
        return result;
    }
    
    public void inOrder(TreeNode node) {
		if(node != null) {
			if(node.left != null) {
                inOrder(node.left);
            }
            
			result.add(node.val);
            
			if(node.right != null) {
                inOrder(node.right);
            }
		}
	}
}