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
class SubTreeOfAnotherTree {
    public boolean isIdentical(TreeNode p, TreeNode q){
        if(p == null || q == null){
            return p == q;
        }

        boolean leftSame =  isIdentical(p.left, q.left);
        boolean rightSame =  isIdentical(p.right, q.right);

        return leftSame && rightSame && p.val == q.val;

    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null){
            return root == subRoot;
        }

        if(root.val == subRoot.val && isIdentical(root, subRoot)){
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}