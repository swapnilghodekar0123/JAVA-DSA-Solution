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
}
class BuildingBinaryTree{
    public static void main(String [] args){
        int [] preOrder = {5, 3, 2, -1, -1, 4, -1, -1, 7, -1, 8, -1, -1};
        Node root = Node.binaryTree(preOrder);
        System.out.println("Root : "+root.val);
        System.out.println("Left : "+root.left.val);
        System.out.println("Right : "+root.right.val);
    }
}