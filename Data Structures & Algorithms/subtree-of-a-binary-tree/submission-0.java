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
    boolean res=false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(isEquals(root,subRoot)){
            res=true;
        }
        isSubtree(root.left,subRoot);
        isSubtree(root.right,subRoot);
        return res;
    }

    boolean isEquals(TreeNode a, TreeNode b){
        if(a==null && b==null){
            return true;
        }
        if(a==null || b==null) return false;
        
        return isEquals(a.left,b.left) && isEquals(a.right,b.right) && a.val==b.val;
    }

}
