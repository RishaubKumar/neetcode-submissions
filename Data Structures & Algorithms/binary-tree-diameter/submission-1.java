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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftD = diameterOfBinaryTree(root.left);
        int leftH = height(root.left);
        int rightD = diameterOfBinaryTree(root.right);
        int rightH = height(root.right);

        int selfD = leftH + rightH ;
        return Math.max(selfD,Math.max(leftD,rightD)); // we have calculated in the form of nodes but here we need in form of edges;

    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh)+1;
    }
}
