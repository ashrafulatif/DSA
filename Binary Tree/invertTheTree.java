public class invertTheTree {
    
    static class Node{
        Node left;
        Node right;
        int data;
        
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static Node invertTree(Node root) {
        
        if(root== null){
            return null;
        }
        
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
    
    public static void print(Node root){
        if (root == null)
        {
            return;
        }
        
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
        
    public static void main(String[] args) {
        
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);
        
        invertTree(root);
        print(root);
     
    }
}
