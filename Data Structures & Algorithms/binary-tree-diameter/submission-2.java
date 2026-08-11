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
    static class Info{
        int dia;
        int ht;
        public Info(int dia,int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }
    public static Info diameter(TreeNode root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int dia = Math.max(Math.max(leftInfo.dia,rightInfo.dia),leftInfo.ht + rightInfo.ht);
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(dia,ht);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia;
    }
}

// this way will give time complexity n^2
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */

// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null){
//             return 0;
//         }
//         int leftD = diameterOfBinaryTree(root.left);
//         int leftH = height(root.left);
//         int rightD = diameterOfBinaryTree(root.right);
//         int rightH = height(root.right);

//         int selfD = leftH + rightH ;
//         return Math.max(selfD,Math.max(leftD,rightD)); // we have calculated in the form of nodes but here we need in form of edges;

//     }
//     public int height(TreeNode root){
//         if(root == null){
//             return 0;
//         }
//         int lh = height(root.left);
//         int rh = height(root.right);

//         return Math.max(lh,rh)+1;
//     }
// }

