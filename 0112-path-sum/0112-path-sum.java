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
    public boolean solve(TreeNode root, int targetSum, int currsum){
        if(root==null) return false;
        currsum+=root.val;
        if(root.left==null && root.right==null && currsum == targetSum){
            return true;
        }
        boolean left = solve(root.left,targetSum, currsum);
        boolean right = solve(root.right,targetSum, currsum);
        return left||right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root,targetSum,0);
    }
}