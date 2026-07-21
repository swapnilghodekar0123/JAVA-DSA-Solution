import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
    
    static int indx = -1;
    static Node binaryTree(int [] preOrder){
        indx++;
        if(preOrder[indx] == -1){
            return null;
        }
        
        Node root = new Node(preOrder[indx]);
        root.left = binaryTree(preOrder);
        root.right = binaryTree(preOrder);
        
        return root;
    }
    
    static int ans = 0;
    public static int findHeight(Node root){
        if(root == null){
            return 0;
        }

        int leftH = findHeight(root.left);
        int rightH = findHeight(root.right);

        ans =  Math.max(ans, leftH+rightH);

        return Math.max(leftH,rightH)+1;

    }
    public static int findDiameter(Node root){
        findHeight(root);
        return ans;
    }
    
}
class DiameterOfTree {
    public static void main(String[] args){
        int [] preOrder = {5, 3, 2, -1, -1, 4, -1, -1, 7, -1, 8, -1, -1};
        Node root = Node.binaryTree(preOrder);
        int diameter = Node.findDiameter(root);
        System.out.println(diameter);
    }
}
