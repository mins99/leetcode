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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        
        return result;
    }
    
    public void preOrder(TreeNode node) {
        if(node != null) {
            result.add(node.val);
            
            if(node.left != null) {
                preOrder(node.left);
            }
            
			if(node.right != null) {
                preOrder(node.right);
            }
		}
	}
}