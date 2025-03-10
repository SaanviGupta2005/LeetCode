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
    public static void dfs(TreeNode root, List<String>arr, String sb){
        if(root==null){
            return;
        }
        sb+=root.val;
        if(root.left==null && root.right==null){
            arr.add(sb);
            return;
        }
        dfs(root.left,arr,sb+"->");
        dfs(root.right,arr,sb+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr = new ArrayList<>();
        dfs(root,arr,"");
        return arr;
    }
}