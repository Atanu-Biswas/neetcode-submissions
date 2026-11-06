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
    
    int maxDia=0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        height(root);
        return maxDia;
    }

    public int height(TreeNode root){
        if(root == null) return 0;
        maxDia= Math.max(height(root.left)+height(root.right),maxDia);
        return Math.max(height(root.left),height(root.right))+1;
    }
}
