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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        getPath(root,p,path1); // here we are populating path1 from root to p and when we have path from p to root and q to root , we will compare them and find out which is lowest common ancestor
        getPath(root,q,path2);

        int i = 0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        return path1.get(i-1);
    }
    public boolean getPath(TreeNode root, TreeNode n,ArrayList<TreeNode> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root == n){
            return true;
        }
        boolean getL = getPath(root.left,n,path);
        boolean getR = getPath(root.right,n,path);

        if(getL || getR){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}
