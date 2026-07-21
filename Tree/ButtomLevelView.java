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

    static class Pair{
        Node node;
        int hval;
        Pair(Node node, int hval){
            this.node = node;
            this.hval = hval;
        }
    }
    
    public static List<Integer> buttomLevelView(Node root){
        List<Integer> list = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer, Node> map = new TreeMap<>();

        queue.add(new Pair(root, 0));
        while(!queue.isEmpty()){
            Pair p = queue.remove();
            Node curr = p.node;
            int hv = p.hval;

            map.put(hv, curr);

            if(curr.left != null){
                queue.add(new Pair(curr.left, hv-1));
            }

            if(curr.right != null){
                queue.add(new Pair(curr.right, hv+1));
            }
        }

        for(Integer ele : map.keySet()){
                Node temp = map.get(ele);
                list.add(temp.val);
            }
        return list;
    }
}
class ButtomLevelView {
    public static void main(String[] args){
        int [] preOrder = {5, 3, 2, -1, -1, 4, -1, -1, 7, -1, 8, -1, -1};
        Node root = Node.binaryTree(preOrder);
        List<Integer> li = Node.buttomLevelView(root);
        System.out.println(li);
        
    }
}
