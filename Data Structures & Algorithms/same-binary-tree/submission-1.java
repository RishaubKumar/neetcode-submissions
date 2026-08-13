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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){ // when both are null than we reached at end of trees or trees are null
            return true;
        }else if(p == null || q == null || p.val != q.val){
            return false; // either any of node become null , or the values are not same than it will become false;
        }
        // Here we check the both above conditons with the left and right part of tree
        if(!isSameTree(p.left,q.left)){
            return false;
        }
        if(!isSameTree(p.right,q.right)){
            return false;
        }
        return true;
    }
}
