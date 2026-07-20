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
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isIdentical(p , q);
    }
    public boolean isIdentical(TreeNode p, TreeNode q){
        if(p==null && q!=null){
            return false;
        }
        if(p!=null && q==null){
            return false;
        }
        if(p==null && q==null){
            return true;
        }

        boolean leftTreeSame = isIdentical(p.left, q.left);
        boolean rightTreeSame = isIdentical(p.right, q.right);

        return leftTreeSame && rightTreeSame && p.val == q.val;
    }
}