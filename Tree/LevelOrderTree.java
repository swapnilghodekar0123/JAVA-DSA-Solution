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
    
      public static void preOrder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.val+" ");
         preOrder(root.left);
         preOrder(root.right);
    }
    
    public static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node curr = queue.remove();
            if(curr==null){
                if(!queue.isEmpty()){
                    System.out.println();
                    queue.add(null);
                    continue;
                }
                else{
                    break;
                }
            }
            System.out.print(curr.val+" ");
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
        }
    }
}
class LevelOrderTree {
    public static void main(String[] args){
        int [] preOrder = {5, 3, 2, -1, -1, 4, -1, -1, 7, -1, 8, -1, -1};
        Node root = Node.binaryTree(preOrder);
        Node.levelOrder(root);
    }
}
