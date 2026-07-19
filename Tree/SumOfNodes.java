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
    
    // Height of Tree
    public static int sumOfNode(Node root){

        if(root==null){
            return 0;
        }

        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);
        
        return leftSum + rightSum + root.val;
    }
}
class SumOfNodes{
    public static void main(String[] args){
        int [] preOrder = {5, 3, 2, -1, -1, 4, -1, -1, 7, -1, 8, -1, -1};
        Node root = Node.binaryTree(preOrder);
        int sum = Node.sumOfNode(root);
        System.out.println(sum);
    }
}
