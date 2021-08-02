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
    public int maxDepth(TreeNode root) {
        int deptLevel = depth(root);
        
        return deptLevel;
    }
    
    public int depth(TreeNode root) {
        int dep, depl, depr ;

        if (root == null) {
            dep = 0 ;
        } else {
            depl = depth(root.left) ;
            depr = depth(root.right) ;
            if (depl >= depr) 
                dep = depl + 1;
            else 
                dep = depr + 1;
        }
        return dep ;
    }
}