class Node{
    int val;
    Node left;
    Node right;

    public Node(int val){
        this.val = val;
        left = null;
        right = null;
    }

    static int indx = -1;
    public static Node binaryTree(int [] preOrder){
        indx++;
        if(preOrder[indx] == -1){
            return null;
        }

        Node root = new Node(preOrder[indx]);

        root.left = binaryTree(preOrder);
        root.right = binaryTree(preOrder);

        return root;

    }

    public static void kLevel(Node root, int k){
        if(root == null){
            return ;
        }
        if(k==1){
            System.out.print(root.val+" ");
            return;
        }

        kLevel(root.left, k-1);
        kLevel(root.right, k-1);
    }
}
class KLevelOfTree{
    public static void main(String [] args){
        int [] preOrder = {5, 3, 2, -1, -1, 4, -1, -1, 7, -1, 8, -1, -1};
        Node root = Node.binaryTree(preOrder);
        Node.kLevel(root, 2);
    }
}